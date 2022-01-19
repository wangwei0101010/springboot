/**
 * FileName: Java8streamTest
 * Author:   Administrator
 * Date:     2020/4/28 9:58
 * Description: JAVA8 新特性STREAM的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Thread;

import com.breakyizhan.web.ModelTest.StreamUser;
import org.junit.Test;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
//如何优雅的使用和理解线程池

/**
 * 在 JDK 1.5 之后推出了相关的 api，常见的创建线程池方式有以下几种：
 * <p>
 * Executors.newCachedThreadPool()：无限线程池。
 * Executors.newFixedThreadPool(nThreads)：创建固定大小的线程池。
 * Executors.newSingleThreadExecutor()：创建单个线程的线程池。
 * 实际上还是利用 ThreadPoolExecutor 类实现的。所以我们重点来看下 ThreadPoolExecutor 是怎么玩的。
 * public static ExecutorService newCachedThreadPool() {
 * return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
 * 60L, TimeUnit.SECONDS,
 * new SynchronousQueue<Runnable>());
 * }
 * 首先是创建线程的 api：
 * ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler)
 * 这几个核心参数的作用：
 * <p>
 * corePoolSize 为线程池的基本大小。
 * maximumPoolSize 为线程池最大线程大小。
 * keepAliveTime 和 unit 则是线程空闲后的存活时间。
 * workQueue 用于存放任务的阻塞队列。
 * handler 当队列和最大线程池都满了之后的饱和策略。
 * 通常我们都是使用:	  threadPool.execute(new Job());
 * ThreadPoolExecutor常量
 * private static final int RUNNING    = -1 << COUNT_BITS;自然是运行状态，指可以接受任务执行队列里的任务
 * private static final int SHUTDOWN   =  0 << COUNT_BITS;指调用了 shutdown() 方法，不再接受新任务了，但是队列里的任务得执行完毕。
 * private static final int STOP       =  1 << COUNT_BITS;指调用了 shutdownNow() 方法，不再接受新任务，同时抛弃阻塞队列里的所有任务并中断所有正在执行任务。
 * private static final int TIDYING    =  2 << COUNT_BITS; 所有任务都执行完毕，在调用 shutdown()/shutdownNow() 中都会尝试更新为这个状态。
 * private static final int TERMINATED =  3 << COUNT_BITS; 终止状态，当执行 terminated() 后会更新为这个状态。
 * <p>
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * new Thread(new Runnable() {
 *
 * @Override public void run() {
 * // TODO Auto-generated method stub
 * }
 * }).start();
 * <p>
 * 那你就out太多了，new Thread的弊端如下：
 * a. 每次new Thread新建对象性能差。
 * b. 线程缺乏统一管理，可能无限制新建线程，相互之间竞争，及可能占用过多系统资源导致死机或oom。
 * c. 缺乏更多功能，如定时执行、定期执行、线程中断。
 * 相比new Thread，Java提供的四种线程池的好处在于：
 * a. 重用存在的线程，减少对象创建、消亡的开销，性能佳。
 * b. 可有效控制最大并发线程数，提高系统资源的使用率，同时避免过多资源竞争，避免堵塞。
 * c. 提供定时执行、定期执行、单线程、并发数控制等功能。
 * Java通过Executors提供四种线程池，分别为：
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 */
public class ThreadTest {

    public static void main(String[] args) {
        //newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
        //CachedThreadPool();

        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。示例代码如下：
        //fixedThreadPool();

        //创建一个定长线程池，支持定时及周期性任务执行。
        //ScheduledExecutorService比Timer更安全，功能更强大，后面会有一篇单独进行对比。
       // scheduledThreadPool();

        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。示例代码如下：
       // getSingleThreadExecutor();

        //TestSingleThreadExecutor
        //TestSingleThreadExecutor();

        //TestFixedThreadPool
        //TestFixedThreadPool();

        //TestCachedThreadPool
        TestCachedThreadPool();

    }

    private static void TestCachedThreadPool() {
        //创建一个可重用固定线程数的线程池

        ExecutorService pool = Executors.newCachedThreadPool();

        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口

        Thread t1 = new MyThread();

        Thread t2 = new MyThread();

        Thread t3 = new MyThread();

        Thread t4 = new MyThread();

        Thread t5 = new MyThread();

        //将线程放入池中进行执行

        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);

        //关闭线程池

        pool.shutdown();


    }

    private static void TestFixedThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        fixedThreadPool.execute(t1);
        fixedThreadPool.execute(t2);
        fixedThreadPool.execute(t3);
        fixedThreadPool.execute(t4);
        fixedThreadPool.execute(t5);
        //关闭线程池
        fixedThreadPool.shutdown();
    }

    private static void TestSingleThreadExecutor() {
        //创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newSingleThreadExecutor();
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        //关闭线程池
        pool.shutdown();
    }

    private static void getSingleThreadExecutor() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {

                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }

    }

    private static void scheduledThreadPool() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {

            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
            //表示延迟3秒执行。
        }, 3, TimeUnit.SECONDS);
    }

    private static void fixedThreadPool() {
        //因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
        //定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()。可参考PreloadDataCache。
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private static void CachedThreadPool() {
        //newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
        //线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });


        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "正在执行。。。");

        }

    }
}





