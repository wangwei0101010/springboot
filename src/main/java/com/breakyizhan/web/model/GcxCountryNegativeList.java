package com.breakyizhan.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value="双公示处罚",description="双公示处罚对应的model")
public class GcxCountryNegativeList{
	@ApiModelProperty(value="自增ID",name="id",dataType="Integer")
	private Integer id;

	@ApiModelProperty(value="处罚决定文书号",name="paperId",dataType="String")
	private String paperId;

	@ApiModelProperty(value="处罚决定书名称或标题",name="name",dataType="String")
	private String name;

	@ApiModelProperty(value="处罚原因",name="reason",dataType="String")
	private String reason;

	@ApiModelProperty(value="处罚依据",name="based",dataType="String")
	private String based;

	@ApiModelProperty(value="处罚机关部门",name="departments",dataType="String")
	private String departments;

	@ApiModelProperty(value="处罚类别1",name="class1",dataType="String")
	private String class1;

	@ApiModelProperty(value="处罚类别2",name="class2",dataType="String")
	private String class2;

	@ApiModelProperty(value="受处罚人或单位主体",name="punishMan",dataType="String")
	private String punishMan;

	@ApiModelProperty(value="身份证 ",name="punishManCard",dataType="String")
	private String punishManCard;

	@ApiModelProperty(value="组织机构代码",name="organizationCode",dataType="String")
	private String organizationCode;

	@ApiModelProperty(value="工商登记号码",name="businessNumber",dataType="String")
	private String businessNumber;

	@ApiModelProperty(value="统一信用代码",name="secrurityCode",dataType="String")
	private String secrurityCode;

	@ApiModelProperty(value="税务登记号",name="taxId",dataType="String")
	private String taxId;

	@ApiModelProperty(value="法人代表行政相对人",name="authorman",dataType="String")
	private String authorman;

	@ApiModelProperty(value="处罚结果",name="result",dataType="String")
	private String result;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(value="处罚日期",name="penaltyTime",dataType="Date")
	private Date penaltyTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(value="发布时间",name="publishDate",dataType="Date")
	private Date publishDate;

	@ApiModelProperty(value="有效期至",name="validityDate",dataType="String")
	private String validityDate;

	@ApiModelProperty(value="当前状态",name="currentState",dataType="String")
	private String currentState;

	@ApiModelProperty(value="所属省份",name="province",dataType="String")
	private String province;

	@ApiModelProperty(value="所属城市",name="city",dataType="String")
	private String city;

	@ApiModelProperty(value="所属地区",name="area",dataType="String")
	private String area;

	@ApiModelProperty(value="地区代码",name="areaCard",dataType="String")
	private String areaCard;

	@ApiModelProperty(value="图片格式的处罚书",name="picture",dataType="Byte[]")
	private Byte[] picture;

	@ApiModelProperty(value="图片存在地址",name="pictureUrl",dataType="String")
	private String pictureUrl;

	@ApiModelProperty(value="行业类别",name="businessType",dataType="String")
	private String businessType;

	@ApiModelProperty(value="行政处罚决定书(全文或摘要)",name="contents",dataType="String")
	private String contents;

	@ApiModelProperty(value="来源",name="source",dataType="String")
	private String source;

	@ApiModelProperty(value="MD5值",name="mdkey",dataType="String")
	private String mdkey;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(value="插入时间",name="insertTime",dataType="Date")
	private Date insertTime;

	@ApiModelProperty(value="救济渠道",name="helpPipe",dataType="String")
	private String helpPipe;

	@ApiModelProperty(value="处罚日期字符串",name="penaltyTimeVarchar",dataType="String")
	private String penaltyTimeVarchar;

	@ApiModelProperty(value="处罚生效期字符串",name="penaltyIntoEffectVarchar",dataType="String")
	private String penaltyIntoEffectVarchar;

	@ApiModelProperty(value="处罚截止期",name="penaltyEndDateVarchar",dataType="String")
	private String penaltyEndDateVarchar;

	@ApiModelProperty(value="备注",name="remarks",dataType="String")
	private String remarks;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	

	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId == null ? null : paperId.trim();
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason == null ? null : reason.trim();
	}	

	public String getBased() {
		return based;
	}

	public void setBased(String based) {
		this.based = based == null ? null : based.trim();
	}	

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments == null ? null : departments.trim();
	}	

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1 == null ? null : class1.trim();
	}	

	public String getClass2() {
		return class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2 == null ? null : class2.trim();
	}	

	public String getPunishMan() {
		return punishMan;
	}

	public void setPunishMan(String punishMan) {
		this.punishMan = punishMan == null ? null : punishMan.trim();
	}	

	public String getPunishManCard() {
		return punishManCard;
	}

	public void setPunishManCard(String punishManCard) {
		this.punishManCard = punishManCard == null ? null : punishManCard.trim();
	}	

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode == null ? null : organizationCode.trim();
	}	

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber == null ? null : businessNumber.trim();
	}	

	public String getSecrurityCode() {
		return secrurityCode;
	}

	public void setSecrurityCode(String secrurityCode) {
		this.secrurityCode = secrurityCode == null ? null : secrurityCode.trim();
	}	

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId == null ? null : taxId.trim();
	}	

	public String getAuthorman() {
		return authorman;
	}

	public void setAuthorman(String authorman) {
		this.authorman = authorman == null ? null : authorman.trim();
	}	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result == null ? null : result.trim();
	}	

	public Date getPenaltyTime() {
		return penaltyTime;
	}

	public void setPenaltyTime(Date penaltyTime) {
		this.penaltyTime = penaltyTime;
	}	

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}	

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate == null ? null : validityDate.trim();
	}	

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState == null ? null : currentState.trim();
	}	

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area == null ? null : area.trim();
	}	

	public String getAreaCard() {
		return areaCard;
	}

	public void setAreaCard(String areaCard) {
		this.areaCard = areaCard == null ? null : areaCard.trim();
	}	

	public Byte[] getPicture() {
		return picture;
	}

	public void setPicture(Byte[] picture) {
		this.picture = picture;
	}	

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
	}	

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType == null ? null : businessType.trim();
	}	

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents == null ? null : contents.trim();
	}	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}	

	public String getMdkey() {
		return mdkey;
	}

	public void setMdkey(String mdkey) {
		this.mdkey = mdkey == null ? null : mdkey.trim();
	}	

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}	

	public String getHelpPipe() {
		return helpPipe;
	}

	public void setHelpPipe(String helpPipe) {
		this.helpPipe = helpPipe == null ? null : helpPipe.trim();
	}	

	public String getPenaltyTimeVarchar() {
		return penaltyTimeVarchar;
	}

	public void setPenaltyTimeVarchar(String penaltyTimeVarchar) {
		this.penaltyTimeVarchar = penaltyTimeVarchar == null ? null : penaltyTimeVarchar.trim();
	}	

	public String getPenaltyIntoEffectVarchar() {
		return penaltyIntoEffectVarchar;
	}

	public void setPenaltyIntoEffectVarchar(String penaltyIntoEffectVarchar) {
		this.penaltyIntoEffectVarchar = penaltyIntoEffectVarchar == null ? null : penaltyIntoEffectVarchar.trim();
	}	

	public String getPenaltyEndDateVarchar() {
		return penaltyEndDateVarchar;
	}

	public void setPenaltyEndDateVarchar(String penaltyEndDateVarchar) {
		this.penaltyEndDateVarchar = penaltyEndDateVarchar == null ? null : penaltyEndDateVarchar.trim();
	}	

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}	




}