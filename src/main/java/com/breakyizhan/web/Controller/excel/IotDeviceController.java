package com.breakyizhan.web.Controller.excel;

import com.alibaba.excel.EasyExcel;
import com.breakyizhan.web.model.IotDevice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/iotdevicemgt/iot-device")
public class IotDeviceController {


  @PostMapping("/import")
  public void importCustomerDaily(@RequestParam("file") MultipartFile file
      , @RequestParam("productId") Integer productId) throws IOException {
    InputStream inputStream = file.getInputStream();

    if (file == null) {
      System.err.println("111");
    }
    if (file.isEmpty()) {
      System.err.println("222");
    }

    List<IotDevice> reqCustomerDailyImports = EasyExcel.read(inputStream)
        // 这个转换是成全局的， 所有java为string,excel为string的都会用这个转换器。
        // 如果就想单个字段使用请使用@ExcelProperty 指定converter
        // .registerConverter(new StringConverter())
        // 注册监听器，可以在这里校验字段
        .registerReadListener(new CustomerDailyImportListener())
        .head(IotDevice.class)
        .sheet()
        .headRowNumber(2)
        .doReadSync();


    reqCustomerDailyImports.stream().forEach(item -> item.setProductId(productId));

    for (IotDevice iot : reqCustomerDailyImports
    ) {
      System.err.println(iot);
    }


  }


  @PostMapping("/import1")
  public void importCustomerDaily1(@RequestParam MultipartFile file1) throws IOException {
    InputStream inputStream = file1.getInputStream();
    List<IotDevice> reqCustomerDailyImports = EasyExcel.read(inputStream)
        .head(IotDevice.class)
        // 设置sheet,默认读取第一个
        .sheet()
        // 设置标题所在行数
        .headRowNumber(2)
        .doReadSync();

    List<IotDevice> destList = new ArrayList<>(reqCustomerDailyImports.size());
    for (IotDevice p : destList) {
      destList.add(p);
    }

  }


  @ResponseBody
  @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/downloadTemplate")
  public void downloadTemplate(HttpServletResponse response) {
    String fileName = "/Users/wangwei/work/me/myGitHub/springboot/src/main/resources/exportDeviceTemplate.xlsx";
    //String appRootFolder = System.getProperty("user.dir")+File.separator;
    File f = new File(fileName);
    try {
      if (!f.exists()) {
        throw new Exception("文件不存在");
      }
      ServletOutputStream out = response.getOutputStream();
      response.setHeader("Set-Cookie",
          "cookiename=cookievalue;path=/;Domain=domainvaule;Max-age=seconds;HttpOnly");
      response.setHeader("Content-Disposition",
          "attachment;fileName=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
      response.setCharacterEncoding("utf-8");
      // response.setContentType("multipart/form-data");
      response.setContentType("application/vnd.ms-excel");
      try {
        FileInputStream fileInputStream = new FileInputStream(f);
        byte[] buffer = new byte[1024];
        int b = 0;
        while ((b = fileInputStream.read(buffer)) != -1) {
          out.write(buffer, 0, b);
        }
        fileInputStream.close();
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        out.flush();
        out.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
