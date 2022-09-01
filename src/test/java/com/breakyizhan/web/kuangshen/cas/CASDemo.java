package com.breakyizhan.web.kuangshen.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/*** ABA 问题的解决 AtomicStampedReference * 注意变量版本号修改和获取问题。不要写错
 * 什么是ABA问题:
 形象的说就是，狸猫换太子.ABA问题就是 讲桌上面放了1瓶水，张三有10秒的操作时间，他先把水换成了 水果，用了2秒，接着他又把水果换成了水，尽管最后的结果没有发生改变，但是这之间有很多次的操作机会，所以就造成了漏洞，也就是常说的狸猫换太子（比喻：你老婆出轨之后又回来，还是原来的老婆吗？）
 怎么解决ABA问题?
 AtomicReference原子引用
 如果赋值操作不是线程安全的。若想不用锁来实现，可以用**AtomicReference**这个类，实现对象引用的原子更新

 */
public class CASDemo {

  static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100,
      1);

  public static void main(String[] args) {
    new Thread(() -> {
      int stamp = atomicStampedReference
          .getStamp(); // 获得版本号
      System.out.println("T1 stamp 01=>" + stamp); // 暂停2秒钟，保证下面线程获得初始版本号
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(),
          atomicStampedReference.getStamp() + 1);
      System.out.println("T1 stamp 02=>" + atomicStampedReference.getStamp());
      atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(),
          atomicStampedReference.getStamp() + 1);
      System.out.println("T1 stamp 03=>" + atomicStampedReference.getStamp());
    }, "T1").start();
    new Thread(() -> {
      int stamp = atomicStampedReference.getStamp(); // 获得版本号
      System.out.println("T2 stamp 01=>" + stamp); // 暂停3秒钟，保证上面线程先执行
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      boolean result = atomicStampedReference.compareAndSet(100, 2019, stamp, stamp + 1);
      System.out.println("T2 是否修改成功 =>" + result);
      System.out.println("T2 最新stamp =>" + atomicStampedReference.getStamp());
      System.out.println("T2 当前的最新值 =>" + atomicStampedReference.getReference());
    }, "T2").start();
  }
}
