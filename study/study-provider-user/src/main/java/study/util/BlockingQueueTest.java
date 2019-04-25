package study.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wenyi
 * @Description
 * @Date $time$ $date$
 */


public class BlockingQueueTest {

    public static class Basket {
        BlockingQueue<String> basket = new ArrayBlockingQueue<String>(3);

        //存取
        public void produce(String num) throws InterruptedException {
            basket.put(num);
        }

        //取出
        public String consume() throws InterruptedException {
            //若为空 等到有值为止
            String apple = basket.take();
            return apple;
        }

        public int getAppliNumber() {
            return basket.size();
        }
    }

    public  static void tastBasket() {
        final Basket basket = new Basket();

        class Producer implements Runnable {
            @Override
            public void run() {
                try {
                    while (true) {
                        int i = 0;
                        System.out.println("存储数据：" + System.currentTimeMillis());
                        basket.produce(String.valueOf(i));
                        System.out.println("存储数据完毕：" + System.currentTimeMillis());
                        System.out.println("存储数据大小：" + basket.getAppliNumber());
                        i++;
                        //睡眠300ms
                        Thread.sleep(300);
                    }

                } catch (InterruptedException ex) {

                }
            }
        }

        class Consumer implements Runnable {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("取出：" + System.currentTimeMillis());
                        System.out.println("值位：：" + basket.consume());
                        System.out.println("取出完毕：" + System.currentTimeMillis());
                        System.out.println("剩余数量：" + basket.getAppliNumber());
                        //睡眠1000ms
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {

                }
            }
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        executorService.submit(producer);
        executorService.submit(consumer);
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){

        }
        executorService.shutdownNow();
    }

    public static void main(String[] args) {
        BlockingQueueTest.tastBasket();
    }

}
