package test;

/**
 * @author THY
 * @date 2019/3/1
 */
public class DeadLockTest2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DeadLock(true));
        thread1.start();
        Thread thread2 = new Thread(new DeadLock(false));
        thread2.start();
    }
}

class DeadLock implements Runnable{
    //不加 static 会导致 构造的 Object 实例不是同一个，导致 synchronize 块不是同一个锁标记，无法实现死锁
    static Object object1 = new Object();
    static Object object2 = new Object();

    boolean isLock;

    public DeadLock(boolean isLock) {
        this.isLock = isLock;
    }

    @Override
    public void run() {
        if (isLock) {
            synchronized (object1) {
                try {
                    System.out.println(Thread.currentThread().getName() +" get Locking1.....");
                    Thread.sleep(500);
                    System.out.println("after 500ms");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " need lock2!Just waiting!");
                synchronized (object2){
                    System.out.println(Thread.currentThread().getName() +" get Locking2.....");
                }
            }

        }else {
            synchronized (object2){
                try {
                    System.out.println(Thread.currentThread().getName() +" get Locking2.....");
                    Thread.sleep(500);
                    System.out.println("after 500ms");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " need lock1!Just waiting!");
                synchronized (object1) {
                    System.out.println(Thread.currentThread().getName() +" get Locking1.....");
                }
            }
        }
    }
}
