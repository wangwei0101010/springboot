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

//兼容JavaScript
  @Test
  public void cron() throws ScriptException {
    String cron = "11.34  > 12";
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine se = scriptEngineManager.getEngineByName("js");
    boolean eval = (boolean) se.eval(cron);
    System.err.println(eval);

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
}
