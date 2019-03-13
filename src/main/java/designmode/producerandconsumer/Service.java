package designmode.producerandconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 测试类
 * @author THY
 * @date 2019/3/12
 */
public class Service {
    public static void main(String[] args) {
        BlockingQueue<Food> queue = new LinkedBlockingDeque<>(10);

        Producer[] producers = new Producer[4];
        Consumer[] consumers = new Consumer[20];

        for (int i = 0; i < 4; i++) {
            producers[i] = new Producer(queue);
        }
        for (int j = 0; j < 20; j++) {
            consumers[j] = new Consumer(queue);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 4; i++) {
            executorService.execute(producers[i]);
        }
        for (int j = 0; j < 20; j++) {
            executorService.execute(consumers[j]);
        }
        try {
            Thread.sleep(1000 * 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
