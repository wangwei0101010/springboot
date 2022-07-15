package com.breakyizhan.web.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.breakyizhan.web.entity.IotDevice;
import com.breakyizhan.web.service.IotDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author WangWei
 * @since 2022-02-10
 */
@RestController
@RequestMapping("/IotDevice")
@Slf4j
public class IotDeviceController {

  @Autowired
  public IotDeviceService iotDeviceService;


  @ResponseBody
  @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/list")
  public List<IotDevice> list(IotDevice device) {
    List<IotDevice> iotProductServiceDefiList = null;
    try {
      QueryWrapper<IotDevice> iotProductServiceDefiQueryWrapper = new QueryWrapper<>();

      iotProductServiceDefiList = iotDeviceService
          .list(iotProductServiceDefiQueryWrapper);

    } catch (Exception e) {
      log.error("IotDeviceForProperty -=- {}", e.toString());
    }
    return iotProductServiceDefiList;
  }


}