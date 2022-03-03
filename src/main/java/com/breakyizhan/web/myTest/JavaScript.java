package com.breakyizhan.web.myTest;

import java.io.File;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.junit.Test;
import org.springframework.util.ResourceUtils;

public class JavaScript {
  //兼容JavaScript
  @Test
  public void test1() throws ScriptException {
    String cron = "11.34  > 12";
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine se = scriptEngineManager.getEngineByName("JavaScript");
    boolean eval = (boolean) se.eval(cron);
    System.err.println(eval);

  }

  @Test
  public void file() throws Exception{
    String cron = "111.34  > 12";
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    File file = ResourceUtils.getFile("classpath:qiuzhi.js");
    engine.eval(new java.io.FileReader(file));
    Invocable inv = (Invocable) engine;
    boolean res = (boolean) inv.invokeFunction("encrypt", cron);
    System.out.println("res:" + res);


  }

}
