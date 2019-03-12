package designmode.producerandconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * 消费者类
 * @author THY
 * @date 2019/3/12
 */
public class Consumer implements Runnable {
    private boolean working = true;
    private BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Food food = (Food)blockingQueue.take();
                System.out.println(food.getId() + "号食物已被" + Thread.currentThread().getId() + "号顾客端走");
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
