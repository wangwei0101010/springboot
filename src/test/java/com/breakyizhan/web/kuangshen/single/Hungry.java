package com.breakyizhan.web.kuangshen.single;
/**
 *
 * 饿汉单例模式一定要加final? 答案是 不可以！必须加上final关键词！
 *首先你要知道的是，反射可以随时随地脱下JVM的底裤。。。所以Java中的任何权限控制，在反射环境下，基本是不存在的。
 *
 * 大概描述下思路：
 * 1.我先用反射调用单例类的构造函数，创建出新的单例对象来。
 * 2.使用field去访问到原本的单例对象。
 * 3.使用set方法把新创建的单例对象赋值给原本的对象。
 * 4.查看是否能赋值成功。
 * 基于不加final的后果如下程序可证：
 *
 *
 * public class Main {
 *     public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
 *         System.out.println("第一次拿到单例模式创建的对象: " + Singleton.getSingle());
 *
 *         Class<Singleton> clazz = Singleton.class;
 *         Constructor<Singleton> c0 = clazz.getDeclaredConstructor();
 *         c0.setAccessible(true);
 *         Singleton po = c0.newInstance();
 *         System.out.println("反射创建出来的对象: " + po);
 *
 *         Field[] fields = clazz.getDeclaredFields();
 *         for (Field field : fields) {
 *             field.setAccessible(true);
 *             Singleton singleton1 = (Singleton) field.get(Singleton.getSingle());
 *             System.out.println("拿到单例模式创建的对象: " + singleton1);
 *             field.set(Singleton.getSingle(), po); //把反射创建出来的对象赋值给单例对象
 *             System.out.println("第二次拿到单例模式创建的对象: " + Singleton.getSingle());
 *         }
 *     }
 * }
 *
 * ----------------------------------------------------
 * 运行结果：
 * 第一次拿到单例模式创建的对象: com.service.Singleton@16b98e56
 * 反射创建出来的对象: com.service.Singleton@7ef20235
 * 拿到单例模式创建的对象: com.service.Singleton@16b98e56
 * 第二次拿到单例模式创建的对象: com.service.Singleton@7ef20235

 如果加上final运行结果为：
 第一次拿到单例模式创建的对象: com.service.Singleton@16b98e56
 反射创建出来的对象: com.service.Singleton@7ef20235
 拿到单例模式创建的对象: com.service.Singleton@16b98e56
 Exception in thread "main" java.lang.IllegalAccessException: Can not set static final com.service.Singleton field com.service.Singleton.singleton to com.realife.service.Singleton
 at sun.reflect.UnsafeFieldAccessorImpl.throwFinalFieldIllegalAccessException(UnsafeFieldAccessorImpl.java:76)
 at sun.reflect.UnsafeFieldAccessorImpl.throwFinalFieldIllegalAccessException(UnsafeFieldAccessorImpl.java:80)
 at sun.reflect.UnsafeQualifiedStaticObjectFieldAccessorImpl.set(UnsafeQualifiedStaticObjectFieldAccessorImpl.java:77)
 at java.lang.reflect.Field.set(Field.java:764)
 at com.service.Main.main(Main.java:23)
 所以这样看来，加上final是更安全的单例方式。



 * */
/**
 * 饿汉式单例
 */
public class Hungry {

  //可能浪费空间
  private byte[] data1 = new byte[1024 * 1024];
  private byte[] data2 = new byte[1024 * 1024];
  private byte[] data3 = new byte[1024 * 1024];
  private byte[] data4 = new byte[1024 * 1024];

  //私有修饰,禁止其他new对象
  private Hungry() {
  }

  private final static Hungry HUNBRY = new Hungry();

  public static Hungry getInstance() {
    return HUNBRY;
  }


}
