package com.breakyizhan.web.myTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.junit.Test;

//正则表达式
public class regex {

  @Test
  public void ssdf() {
    // String topic = "/sys/${productKey}/${deviceName}/thing/event/${tsl.event.identifier}/post";
    //  String topic = "/sys/${productKey}/${deviceName}/thing/event/${tsl.event.identifier}/post";
    String topic = "/sys/${productKey}/${deviceName}/thing/event/222,2/post";
    String topicPropertyTemplate = "/sys/${productKey}/${deviceName}/thing/event/property/post";
//property
    //写正则表达式
    String regex = "^/sys/((?!/).)*(/)((?!/).)*(/thing/event/)[0-9,]*(/post)";

    String regexProperty = "^/sys/((?!/).)*(/)((?!/).)*(/thing/event/property/post)";
    // String regex = "^/sys/((?!/).)*(/)((?!/).)*(/thing)";
// 将给定的正则表达式编译到模式中。
    Pattern pattern = Pattern.compile(regex);
//匹配字符串
    Matcher matcher = pattern.matcher(topic);
    boolean b = matcher.find();
    System.err.println("b  " + b);
    boolean matches = Pattern.matches(regex, topic);
    System.err.println("matches+" + matches);
    System.err.println("--------------");
    //property
    Pattern patternProperty = Pattern.compile(regexProperty);
    Matcher matcherProperty = patternProperty.matcher(topicPropertyTemplate);
    boolean bProperty = matcherProperty.find();
    System.err.println("bProperty  " + bProperty);
    boolean matchesProperty = Pattern.matches(regexProperty, topicPropertyTemplate);
    System.err.println("matchesProperty+" + matchesProperty);

    System.err.println(LocalDateTime.now());



  }



  @Test
  public void replace() {
    String ss = "${当前气体浓度} > ${气体浓度告警峰值}";
    String regex = "(\\$((?!\\}).)*\\})";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher1 = pattern.matcher(ss);
    String s = matcher1.replaceFirst("29");
    System.err.println(s);
    Matcher matcher = pattern.matcher(s);
    String s1 = matcher.replaceFirst("100");
    System.err.println(s1);

    String sss = "${当前气体浓度}         >    ${气体浓度告警峰值}";
    String[] split = sss.split("\\s+");//替换空格
    Arrays.stream(split).forEach(
        i -> System.err.println(i)
    );


  }

//标准版替换
  @Test
  public void replace1() {
    //替换产品和设备
    String prod = "产品BBBB";
    String dev = "设备bbbb";
    String topic = "/sys/产品A/设备a/thing/sdf/event/sss";
    String ssout = topic.replaceFirst("^/sys(/[^/]*)(/[^/]*)(/[^/]*)", "/sys/" +prod +"/" + dev +"$3"  );
    System.err.println("111   "+ssout);




  //网上搜索的
    String url = "http://example.com:8080/files/username/oldpassword/12351.png";
    //            http://example.com:8080/files/username/anyNewRandomPassword/312351.png
    String newPass = "anyNewRandomPassword";
    String out = url.replaceFirst("(.*/)(.*)(/[^/]*)", "$1" + newPass + "$3");
    System.err.println(out);



  }
}
