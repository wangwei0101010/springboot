package com.breakyizhan.web.model;

import com.breakyizhan.web.common.util.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @ClassName QueryParamModel
 * @Description TODO
 * @Author qimy
 * @Date 2018/5/16 16:42
 **/
@ApiModel(value="查询和返回列表信息",description="")
public class ResourceAllModel extends Page {
    @ApiModelProperty(value="企业和个人名称",name="id",dataType="int")
    private int id;
    @ApiModelProperty(value="企业和个人名称",name="punishMan",dataType="String")
    private String punishMan;
    @ApiModelProperty(value="处罚类型/数据类别",name="copyName",dataType="String")
    private String type;
    @ApiModelProperty(value="数据时间",name="copyName",dataType="String")
    private Date insertTime;
    @ApiModelProperty(value="省份",name="province",dataType="province")
    private String province;

    public String getPunishMan() {
        return punishMan;
    }

    public void setPunishMan(String punishMan) {
        this.punishMan = punishMan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
