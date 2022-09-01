package com.breakyizhan.web.kuangshen.single;

import java.lang.reflect.Constructor;

//懒汉式单例
public class LazyMan {

  private LazyMan(){
    synchronized(LazyMan.class){
      if(LazyMan!=null){
        throw new RuntimeException("不要视图使用反射来破解");
      }
    }
    System.out.println(Thread.currentThread().getName());

  }

  //避免new对象指令重排,需要加volatile
  private volatile static LazyMan LazyMan;

  public static LazyMan getInstance(){
    //双重检测锁模式DCL懒汉式
    if(LazyMan == null){
      synchronized(LazyMan.class){
        if(LazyMan == null){
          LazyMan = new LazyMan();//不是原子性操作
          /**
           * new对象3步骤
           * 1.分配内存空间
           * 2.执行构造方法,初始化对象
           * 3.把这个对象指向这个空间
           *
           * */
        }
      }
    }
    return LazyMan;
  }
  //单线程没问题
/*  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Thread(()->{
        LazyMan.getInstance();
      }).start();
    }
  }*/

  //反射
  public static void main(String[] args) throws Exception {
    com.breakyizhan.web.kuangshen.single.LazyMan instance = LazyMan.getInstance();
    Constructor<? extends com.breakyizhan.web.kuangshen.single.LazyMan> declaredConstructor = instance
        .getClass().getDeclaredConstructor(null);
    declaredConstructor.setAccessible(true);//无视私有
    com.breakyizhan.web.kuangshen.single.LazyMan instance2 = declaredConstructor.newInstance();
    System.out.println(instance);
    System.out.println(instance2);


  }



}
