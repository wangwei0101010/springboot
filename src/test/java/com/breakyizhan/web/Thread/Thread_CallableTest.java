package com.breakyizhan.web.Thread;


import io.swagger.models.auth.In;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 *前面学习了创建线程的两种方式：
 *     1）继承Thread类
 *     2）实现Runnable接口
 *       这两种方式有如下缺点：
 *     1）没有返回值
 *     2）不支持泛型
 *     3）异常必须处理
 *
 * 实现多线程的第三种方式：  实现Callable接口，重写call方法
 *        Callable功能更加强大
 *     1）Future接口位于 java.util.concurrent 包中，可以对具体Runnable、Callable任务的执行结果进行取消，
 *
 *          （cancel方法，尝试取消执行此任务）
 *          查询是否完成（isDone方法）、获取结果（get方法，等待完成，然后检索其结果）等。
 *     2）FutureTask是Future接口唯一的实现类
 *
 *     3）FutureTask同时实现了Runnable，Future接口。它既可以作为Runnable被线程执行，
 *
 *            又可以作为Future得到Callable的返回值。
 *
 * */
public class Thread_CallableTest {

    public static void main(String[] args ) throws Exception{
        //创建任务
        MyCallable mc = new MyCallable();

        /**FutureTask同时实现了Runnable，Future接口。
         * 它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值
         */
        //交付任务管理
  /*      FutureTask<String> task = new FutureTask<>(mc);//可以看出FutureTask实现了runnable接口
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("获取结果:"+task.get());
        System.out.println("任务是否完成:"+task.isDone());
*/
//int copy副本,副本修改本身不修改
        //对象是修改本地值
        Integer i = 10;
        int data[] = new int[10];
        data[0] = 20;
        interjj(data);
        System.err.println("end i"+ data[0]);



    }

    public static void interjj(int data[]){
        data[0] = 200;
        System.err.println("interjj"+ data[0]);

    }


    //实现Callable接口，重写call方法
    public static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            String[] str = {"apple", "pear", "banana", "orange", "grape"};
            int i = (int) (Math.random() * 5);
            return str[i];
        }
    }


}

















