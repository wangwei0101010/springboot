package com.breakyizhan.web;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

@SpringBootTest
class WebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public static void main(String[] args) throws IOException {

        //String转date
   /*     String dateStr = "2020年01月01日 11:12:13";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        LocalDate parse = LocalDate.parse(dateStr, formatter);
        System.err.println(parse);
*/
        //date转String
  /*      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        String nowStr = now.format(formatter);
        System.err.println(nowStr);*/

        //获取当前时间
        LocalDate ld = LocalDate.now();
        System.out.println("获取当前日期 ==> " + ld);// 获取当前日期 ==> 2018-12-28
        //获取当前年月日
        int year = ld.getYear();
        Month month = ld.getMonth();
        int monthValue = ld.getMonthValue();
        int day  = ld.getDayOfMonth();
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        int dayOfYear = ld.getDayOfYear();



    }

}
