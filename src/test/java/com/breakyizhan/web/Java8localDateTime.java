/**
 * FileName: Java8localDateTime
 * Author:   Administrator
 * Date:     2020/6/4 16:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/6/4
 * @since 1.0.0
 */
public class Java8localDateTime {

    public static void main(String[] args){
       // java8BeforDate();

        //获取当前时间
        LocalDateTime now = LocalDateTime.now();
        //设置时间
        LocalDateTime setTime = LocalDateTime.of(2020, 06, 04, 16, 58, 20);

        //获取当前年，并判断是否是闰年
        System.out.println("Year " + now.getYear() + " is Leap Year? " + now.toLocalDate().isLeapYear());

        //比较两个日期的先后
        System.out.println("Today is before 01/01/2015? " + now.isBefore(LocalDateTime.of(2015,1, 1, 11, 30)));

        //时间加减
        System.out.println("10 days after today will be " + now.plusDays(10));
        System.out.println("3 weeks after today will be " + now.plusWeeks(3));
        System.out.println("20 months after today will be " + now.plusMonths(20));
        System.out.println("10 days before today will be " + now.minusDays(10));
        System.out.println("3 weeks before today will be " + now.minusWeeks(3));
        System.out.println("20 months before today will be " + now.minusMonths(20));

        //查询日期的特定点
        System.out.println("First date of this month= " + now.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = now.toLocalDate().with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= " + lastDayOfYear);

        //两个日期间的间隔
        Period period = now.toLocalDate().until(lastDayOfYear);
        System.out.println("Period Format= " + period);

        //日期格式化
        String formatTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd mm:ss"));
        System.out.println(formatTime);

        //日期转换
        //Date转换为新的API
        Date date = new Date();
        LocalDateTime dateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of(ZoneId.SHORT_IDS.get("PST")));

        //LocalDateTime转换为Date
        Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());

        //Calendar转换为Instant
        Instant time = Calendar.getInstance().toInstant();

        //TimeZone 转换为 ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);




    }




    private static void java8BeforDate() {
        // 初始化 Date 对象
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);

        Calendar instance = Calendar.getInstance();
        String format1 = simpleDateFormat.format(instance);
        // 使用 toString() 函数显示日期时间
        System.out.println(format1);
    }


}
