package designmode.producerandconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者类
 * @author THY
 * @date 2019/3/12
 */
public class Producer implements Runnable{
    private boolean working = true;
    private BlockingQueue blockingQueue;
    private static AtomicInteger count = new AtomicInteger();
    //构造函数

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(working) {
            int id = count.incrementAndGet();
            Food food = new Food(id);
            if (blockingQueue.offer(food)){
                System.out.println(Thread.currentThread().getId() + "号员工将" + food.getId() + "号食物放入餐桌");
            }else {
                System.out.println("餐桌已满，" + food.getId() + "无法放入餐桌");
            }
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stop(){
        working = false;
    }
}
