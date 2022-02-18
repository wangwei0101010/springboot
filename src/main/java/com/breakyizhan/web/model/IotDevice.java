package com.breakyizhan.web.model;



import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Version;

/**
 * <p>
 * 设备表
 * </p>
 *
 * @author WangWei
 * @since 2022-02-10
 */
@Data
public class IotDevice implements Serializable {



  @ExcelProperty(value = "设备名称",index = 0)
  private String deviceName;

  @ExcelProperty(index =1)
  private String comments;


  @ExcelProperty(index = 2)
  private String region;

  @ExcelProperty(index = 3)
  private String ipAddr;

  @ExcelProperty(index = 4)
  private String version;

  @ExcelProperty(index = 5)
  private String deviceLocalLog;

  @ExcelProperty(index = 6)
  private String geotag;

  @ExcelProperty(index = 7)
  private String deviceLabel;

  @ExcelIgnore
  private Integer productId;



}
