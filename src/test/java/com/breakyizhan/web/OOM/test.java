package com.breakyizhan.web.OOM;

import java.util.ArrayList;
// vm配置,捕获dump文件  -Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError,在项目根目录下
/**
 * GC日志打印常用参数
 * 1. PrintGC
 * 最简单的GC参数。
 * 启用配置：-XX:+PrintGC
 *
 *
 * 2. PrintGCDetails
 * 打印GC的详细信息
 * 启用配置：-XX:+PrintGCDetails
 * 不同的垃圾回收器，GC日志(表示年代的词)可能会不一样， 通常包含GC前后各分区的使用量
 * Times: user表示用户态CPU耗时，sys表示系统CPU耗时，real表示GC实际耗时
 *
 *
 * 3. PrintGCTimeStamps
 * GC时，打印进程启动到现在经历的时间
 * 启用配置：-XX:+PrintGCTimeStamps
 * 该参数需要配合其它GC日志打印参数一起使用，如下
 *
 *
 * 4. PrintGCApplicationStoppedTime
 * 打印GC时，应用停顿时间
 * 启用配置：-XX:+PrintGCApplicationStoppedTime
 *
 *
 * 5. PrintGCApplicationConcurrentTime
 * GC时打印应用执行时间
 * 启用配置：-XX:+PrintGCApplicationConcurrentTime
 *
 *
 * 6. PrintHeapAtGC
 * 每次GC前后打印堆信息
 * 启用配置：-XX:+PrintHeapAtGC
 *
 *
 * 备注：实际生产环境时，建议以上参数同时使用，能更好的了解程序GC的相关信息，可以为内存调优提供更精确的依据
 * GC日志信息默认是打印到控制台，如果需要输出到文件，可以使用参数：-Xloggc:gc.log,gc.log是要输出的日志文件，路径为应用启动路径的相对路径下，也可以使用绝对路径
 *
 * */
public class test {

  byte[] array = new byte[1 * 1024 * 1024];

  public static void main(String[] args) {
    ArrayList<test> list = new ArrayList<>();
    int count = 0;

    try {
      while (true) {
        list.add(new test());
        count = count + 1;
      }
    } catch (Error e) {
      System.err.println("count" + count);
    }


  }

}
