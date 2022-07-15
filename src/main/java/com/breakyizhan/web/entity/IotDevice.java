package com.breakyizhan.web.entity;



import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 设备表
 * </p>
 *
 * @author WangWei
 * @since 2022-02-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IotDevice implements Serializable {


  private static final long serialVersionUID=1L;


  private Long id;

  @ApiModelProperty(value = "所属产品id")
  private Integer productId;

  @ApiModelProperty(value = "设备名称")
  private String deviceName;

  @ApiModelProperty(value = "备注名称")
  private String comments;

  @ApiModelProperty(value = "启用状态:1:激活 2:未激活")
  private Integer activeState;

  @ApiModelProperty(value = "状态: 1:有效,2:已删除")
  private Integer status;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createTime;

  @ApiModelProperty(value = "激活时间")
  private LocalDateTime activationTime;

  @ApiModelProperty(value = "更新时间")
  private LocalDateTime updateTime;

  @ApiModelProperty(value = "地域")
  private String region;

  @ApiModelProperty(value = "IP地址")
  private String ipAddr;

  @ApiModelProperty(value = "固件版本")
  @Version
  private String version;

  @ApiModelProperty(value = "设备本地日志上报")
  private String deviceLocalLog;

  @ApiModelProperty(value = "json格式地理位置标签")
  private String geotag;

  @ApiModelProperty(value = "json格式设备标签")
  private String deviceLabel;




}
