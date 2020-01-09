package com.breakyizhan.web.model;

import com.breakyizhan.web.common.util.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value="",description="")
public class GcxAllCorpNegativeCf extends Page {
	@ApiModelProperty(value="受处罚人或单位主体",name="punishMan",dataType="String")
	private String punishMan;

	@ApiModelProperty(value="法人代表",name="authorman",dataType="String")
	private String authorman;

	@ApiModelProperty(value="所属省份",name="province",dataType="String")
	private String province;

	@ApiModelProperty(value="电话",name="tel",dataType="String")
	private String tel;

	@ApiModelProperty(value="电邮件",name="email",dataType="String")
	private String email;

	@ApiModelProperty(value="地址",name="adress",dataType="String")
	private String adress;

	@ApiModelProperty(value="收录时间",name="addTime",dataType="String")
	private String addTime;

	@ApiModelProperty(value="数据是否在GCX_JIAOTONG_CF中，是为1，不是为0",name="gcxJiaotongCf",dataType="Integer")
	private Integer gcxJiaotongCf;

	@ApiModelProperty(value="数据是否在GCX_SWJ_CF中，是为1，不是为0",name="gcxSwjCf",dataType="Integer")
	private Integer gcxSwjCf;

	@ApiModelProperty(value="数据是否在GCX_GAJ_CF中，是为1，不是为0",name="gcxGajCf",dataType="Integer")
	private Integer gcxGajCf;

	@ApiModelProperty(value="数据是否在GCX_HBJ_CF中，是为1，不是为0",name="gcxHbjCf",dataType="Integer")
	private Integer gcxHbjCf;

	@ApiModelProperty(value="数据是否在GCX_JHSY_CF中，是为1，不是为0",name="gcxJhsyCf",dataType="Integer")
	private Integer gcxJhsyCf;

	@ApiModelProperty(value="数据是否在GCX_NYJ_CF中，是为1，不是为0",name="gcxNyjCf",dataType="Integer")
	private Integer gcxNyjCf;

	@ApiModelProperty(value="数据是否在GCX_LYJ_CF中，是为1，不是为0",name="gcxLyjCf",dataType="Integer")
	private Integer gcxLyjCf;

	@ApiModelProperty(value="数据是否在GCX_LINYEJU_CF中，是为1，不是为0",name="gcxLinyejuCf",dataType="Integer")
	private Integer gcxLinyejuCf;

	@ApiModelProperty(value="数据是否在GCX_GSXZGLJ_CF中，是为1，不是为0",name="gcxGsxzgljCf",dataType="Integer")
	private Integer gcxGsxzgljCf;

	@ApiModelProperty(value="数据是否在GCX_SJJ_CF中，是为1，不是为0",name="gcxSjjCf",dataType="Integer")
	private Integer gcxSjjCf;

	@ApiModelProperty(value="数据是否在GCX_GTZYJ_CF中，是为1，不是为0",name="gcxGtzyjCf",dataType="Integer")
	private Integer gcxGtzyjCf;

	@ApiModelProperty(value="数据是否在GCX_ZLJDJ_CF中，是为1，不是为0",name="gcxZljdjCf",dataType="Integer")
	private Integer gcxZljdjCf;

	@ApiModelProperty(value="数据是否在GCX_SCJDGLJ_CF中，是为1，不是为0",name="gcxScjdgljCf",dataType="Integer")
	private Integer gcxScjdgljCf;

	@ApiModelProperty(value="数据是否在GCX_SPYP_CF中，是为1，不是为0",name="gcxSpypCf",dataType="Integer")
	private Integer gcxSpypCf;

	@ApiModelProperty(value="数据是否在GCX_CZJ_CF中，是为1，不是为0",name="gcxCzjCf",dataType="Integer")
	private Integer gcxCzjCf;

	@ApiModelProperty(value="数据是否在GCX_DSJ_CF中，是为1，不是为0",name="gcxDsjCf",dataType="Integer")
	private Integer gcxDsjCf;

	@ApiModelProperty(value="数据是否在GCX_WJJ_CF中，是为1，不是为0",name="gcxWjjCf",dataType="Integer")
	private Integer gcxWjjCf;

	@ApiModelProperty(value="数据是否在GCX_ZFCXJSJ_CF中，是为1，不是为0",name="gcxZfcxjsjCf",dataType="Integer")
	private Integer gcxZfcxjsjCf;

	@ApiModelProperty(value="数据是否在GCX_RLZYSHBZJ_CF中，是为1，不是为0",name="gcxRlzyshbzjCf",dataType="Integer")
	private Integer gcxRlzyshbzjCf;

	@ApiModelProperty(value="数据是否在GCX_WHJ_CF中，是为1，不是为0",name="gcxWhjCf",dataType="Integer")
	private Integer gcxWhjCf;

	@ApiModelProperty(value="数据是否GCX_SCXZZF_CF在中，是为1，不是为0",name="gcxScxzzfCf",dataType="Integer")
	private Integer gcxScxzzfCf;

	@ApiModelProperty(value="数据是否GCX_CBJ_CF在中，是为1，不是为0",name="gcxCbjCf",dataType="Integer")
	private Integer gcxCbjCf;

	@ApiModelProperty(value="数据是否在GCX_TYJ_CF中，是为1，不是为0",name="gcxTyjCf",dataType="Integer")
	private Integer gcxTyjCf;

	@ApiModelProperty(value="数据是否在GCX_GDJ_CF中，是为1，不是为0",name="gcxGdjCf",dataType="Integer")
	private Integer gcxGdjCf;

	@ApiModelProperty(value="数据是否在GCX_DSJCF_CF中，是为1，不是为0",name="gcxDsjcfCf",dataType="Integer")
	private Integer gcxDsjcfCf;

	@ApiModelProperty(value="数据是否在GCX_YCZMJ_CF中，是为1，不是为0",name="gcxYczmjCf",dataType="Integer")
	private Integer gcxYczmjCf;

	@ApiModelProperty(value="数据是否在GCX_XMJ_CF中，是为1，不是为0",name="gcxXmjCf",dataType="Integer")
	private Integer gcxXmjCf;

	@ApiModelProperty(value="数据是否在GCX_BJJ_CF中，是为1，不是为0",name="gcxBjjCf",dataType="Integer")
	private Integer gcxBjjCf;

	@ApiModelProperty(value="数据是否在GCX_HG_CF中，是为1，不是为0",name="gcxHgCf",dataType="Integer")
	private Integer gcxHgCf;

	@ApiModelProperty(value="数据是否在GCX_CG_CF中，是为1，不是为0",name="gcxCgCf",dataType="Integer")
	private Integer gcxCgCf;

	@ApiModelProperty(value="数据是否在GCX_MFJ_CF中，是为1，不是为0",name="gcxMfjCf",dataType="Integer")
	private Integer gcxMfjCf;

	@ApiModelProperty(value="数据是否在GCX_QXJ_CF中，是为1，不是为0",name="gcxQxjCf",dataType="Integer")
	private Integer gcxQxjCf;

	@ApiModelProperty(value="数据是否在GCX_AJJ_CF中，是为1，不是为0",name="gcxAjjCf",dataType="Integer")
	private Integer gcxAjjCf;

	@ApiModelProperty(value="数据是否在GCX_MZJ_CF中，是为1，不是为0",name="gcxMzjCf",dataType="Integer")
	private Integer gcxMzjCf;

	@ApiModelProperty(value="数据是否在GCX_SCJ_CF中，是为1，不是为0",name="gcxScjCf",dataType="Integer")
	private Integer gcxScjCf;

	@ApiModelProperty(value="数据是否GCX_SW_CF在中，是为1，不是为0",name="gcxSwCf",dataType="Integer")
	private Integer gcxSwCf;

	@ApiModelProperty(value="数据是否在GCX_YWJ_CF中，是为1，不是为0",name="gcxYwjCf",dataType="Integer")
	private Integer gcxYwjCf;

	@ApiModelProperty(value="数据是否在GCX_HSJ_CF中，是为1，不是为0",name="gcxHsjCf",dataType="Integer")
	private Integer gcxHsjCf;

	@ApiModelProperty(value="数据是否在GCX_JLZMGLJ_CF中，是为1，不是为0",name="gcxJlzmgljCf",dataType="Integer")
	private Integer gcxJlzmgljCf;

	@ApiModelProperty(value="数据是否在GCX_YZGL_CF中，是为1，不是为0",name="gcxYzglCf",dataType="Integer")
	private Integer gcxYzglCf;

	@ApiModelProperty(value="数据是否在GCX_SFJ_CF中，是为1，不是为0",name="gcxSfjCf",dataType="Integer")
	private Integer gcxSfjCf;

	@ApiModelProperty(value="数据是否在GCX_RMFY_CF中，是为1，不是为0",name="gcxRmfyCf",dataType="Integer")
	private Integer gcxRmfyCf;

	@ApiModelProperty(value="数据是否在GCX_TJJ_CF中，是为1，不是为0",name="gcxTjjCf",dataType="Integer")
	private Integer gcxTjjCf;

	@ApiModelProperty(value="数据是否在GCX_CQJ_CF中，是为1，不是为0",name="gcxCqjCf",dataType="Integer")
	private Integer gcxCqjCf;

	@ApiModelProperty(value="数据是否在GCX_JYJ_CF中，是为1，不是为0",name="gcxJyjCf",dataType="Integer")
	private Integer gcxJyjCf;

	@ApiModelProperty(value="数据是否在GCX_RMYH_CF中，是为1，不是为0",name="gcxRmyhCf",dataType="Integer")
	private Integer gcxRmyhCf;

	@ApiModelProperty(value="数据是否在GCX_YJJ_CF中，是为1，不是为0",name="gcxYjjCf",dataType="Integer")
	private Integer gcxYjjCf;

	@ApiModelProperty(value="数据是否在GCX_LSJ_CF中，是为1，不是为0",name="gcxLsjCf",dataType="Integer")
	private Integer gcxLsjCf;

	@ApiModelProperty(value="数据是否在GCX_FZHGGJ_CF中，是为1，不是为0",name="gcxFzhggjCf",dataType="Integer")
	private Integer gcxFzhggjCf;

	@ApiModelProperty(value="数据是否在GCX_GHHTDGLJ_CF中，是为1，不是为0",name="gcxGhhtdgljCf",dataType="Integer")
	private Integer gcxGhhtdgljCf;

	@ApiModelProperty(value="数据是否在GCX_GWWSJDJ_CF中，是为1，不是为0",name="gcxGwwsjdjCf",dataType="Integer")
	private Integer gcxGwwsjdjCf;

	@ApiModelProperty(value="数据是否在GCX_WSJ_CF中，是为1，不是为0",name="gcxWsjCf",dataType="Integer")
	private Integer gcxWsjCf;

	@ApiModelProperty(value="数据是否在GCX_JYJYJ_CF中，是为1，不是为0",name="gcxJyjyjCf",dataType="Integer")
	private Integer gcxJyjyjCf;

	@ApiModelProperty(value="数据是否在GCX_YSJ_CF中，是为1，不是为0",name="gcxYsjCf",dataType="Integer")
	private Integer gcxYsjCf;

	@ApiModelProperty(value="数据是否在GCX_LYGLJ_CF中，是为1，不是为0",name="gcxLygljCf",dataType="Integer")
	private Integer gcxLygljCf;

	@ApiModelProperty(value="数据是否在GCX_LHJ_CF中，是为1，不是为0",name="gcxLhjCf",dataType="Integer")
	private Integer gcxLhjCf;

	@ApiModelProperty(value="数据是否在GCX_SANGWUJU_CF中，是为1，不是为0",name="gcxSangwujuCf",dataType="Integer")
	private Integer gcxSangwujuCf;

	@ApiModelProperty(value="数据是否在GCX_KYJTGL_CF中，是为1，不是为0",name="gcxKyjtglCf",dataType="Integer")
	private Integer gcxKyjtglCf;

	@ApiModelProperty(value="数据是否在GCX_TXGLJ_CF中，是为1，不是为0",name="gcxTxgljCf",dataType="Integer")
	private Integer gcxTxgljCf;

	@ApiModelProperty(value="数据是否在GCX_GHJ_CF中，是为1，不是为0",name="gcxGhjCf",dataType="Integer")
	private Integer gcxGhjCf;

	@ApiModelProperty(value="数据是否在GCX_YZGLJ_CF中，是为1，不是为0",name="gcxYzgljCf",dataType="Integer")
	private Integer gcxYzgljCf;

	@ApiModelProperty(value="数据是否在GCX_XXHJ_CF中，是为1，不是为0",name="gcxXxhjCf",dataType="Integer")
	private Integer gcxXxhjCf;

	@ApiModelProperty(value="数据是否在GCX_WGXJ-CF中，是为1，不是为0",name="gcxWgxjCf",dataType="Integer")
	private Integer gcxWgxjCf;

	@ApiModelProperty(value="数据是否在GCX_SLJ_CF中，是为1，不是为0",name="gcxSljCf",dataType="Integer")
	private Integer gcxSljCf;

	@ApiModelProperty(value="数据是否在GCX_GSJ_CF中，是为1，不是为0",name="gcxGsjCf",dataType="Integer")
	private Integer gcxGsjCf;

	@ApiModelProperty(value="数据是否在GCX_CYJLZ_CF中，是为1，不是为0",name="gcxCyjlzCf",dataType="Integer")
	private Integer gcxCyjlzCf;

	@ApiModelProperty(value="数据是否在GCX_XF_CF中，是为1，不是为0",name="gcxXfCf",dataType="Integer")
	private Integer gcxXfCf;

	@ApiModelProperty(value="数据是否在GCXAPP_ENVIRONMEN_PUNISHMENT中，是为1，不是为0",name="gcxappEnvironmenPunishment",dataType="Integer")
	private Integer gcxappEnvironmenPunishment;

	@ApiModelProperty(value="数据是否在GCX_A_TAXPAYER中，是为1，不是为0",name="gcxATaxpayer",dataType="Integer")
	private Integer gcxATaxpayer;

	@ApiModelProperty(value="数据是否在GCX_TAX_LAW_CASES中，是为1，不是为0",name="gcxTaxLawCases",dataType="Integer")
	private Integer gcxTaxLawCases;

	@ApiModelProperty(value="数据是否在GCX_NEGATIVE_LIST中，是为1，不是为0",name="gcxNegativeList",dataType="Integer")
	private Integer gcxNegativeList;

	@ApiModelProperty(value="数据是否在GCXAPP_BANKCOMMITTEE_PUNISH中，是为1，不是为0",name="gcxappBankcommitteePunish",dataType="Integer")
	private Integer gcxappBankcommitteePunish;

	@ApiModelProperty(value="数据是否在GCXAPP_STOCK_PUBLISH中，是为1，不是为0",name="gcxappStockPublish",dataType="Integer")
	private Integer gcxappStockPublish;

	@ApiModelProperty(value="数据是否在GCXAPP_BAOJIANHUI_PUBLISH中，是为1，不是为0",name="gcxappBaojianhuiPublish",dataType="Integer")
	private Integer gcxappBaojianhuiPublish;

	@ApiModelProperty(value="数据是否在GCXAPP_DISHONEST_PEOPLE中，是为1，不是为0",name="gcxappDishonestPeople",dataType="Integer")
	private Integer gcxappDishonestPeople;

	@ApiModelProperty(value="数据是否在GCXAPP_NETLOAN_BLACKLIST中，是为1，不是为0",name="gcxappNetloanBlacklist",dataType="Integer")
	private Integer gcxappNetloanBlacklist;

	@ApiModelProperty(value="数据是否在GCXAPP_ZJB_DISHONEST中，是为1，不是为0",name="gcxappZjbDishonest",dataType="Integer")
	private Integer gcxappZjbDishonest;

	@ApiModelProperty(value="数据是否在GCXAPP_ZJB_PERSON_DISHONEST中，是为1，不是为0",name="gcxappZjbPersonDishonest",dataType="Integer")
	private Integer gcxappZjbPersonDishonest;

	@ApiModelProperty(value="数据是否在GCXAPP_ZJB_QYGRBLXW中，是为1，不是为0",name="gcxappZjbQygrblxw",dataType="Integer")
	private Integer gcxappZjbQygrblxw;

	@ApiModelProperty(value="数据是否在LVYOU_ZJ_COP_BLXX中，是为1，不是为0",name="lvyouZjCopBlxx",dataType="Integer")
	private Integer lvyouZjCopBlxx;

	@ApiModelProperty(value="数据是否在LVYOU_ZJ_PER_BLXX中，是为1，不是为0",name="lvyouZjPerBlxx",dataType="Integer")
	private Integer lvyouZjPerBlxx;

	@ApiModelProperty(value="数据是否在GCX_CORP_JYYC中，是为1，不是为0",name="gcxCorpJyyc",dataType="Integer")
	private Integer gcxCorpJyyc;

	@ApiModelProperty(value="数据是否在GCX_CORP_XZCF中，是为1，不是为0",name="gcxCorpXzcf",dataType="Integer")
	private Integer gcxCorpXzcf;

	@ApiModelProperty(value="来源表",name="fromTable",dataType="String")
	private String fromTable;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(value="插入此表时间",name="insertTime",dataType="Date")
	private Date insertTime;


	public String getPunishMan() {
		return punishMan;
	}

	public void setPunishMan(String punishMan) {
		this.punishMan = punishMan == null ? null : punishMan.trim();
	}	

	public String getAuthorman() {
		return authorman;
	}

	public void setAuthorman(String authorman) {
		this.authorman = authorman == null ? null : authorman.trim();
	}	

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}	

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}	

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress == null ? null : adress.trim();
	}	

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime == null ? null : addTime.trim();
	}	

	public Integer getGcxJiaotongCf() {
		return gcxJiaotongCf;
	}

	public void setGcxJiaotongCf(Integer gcxJiaotongCf) {
		this.gcxJiaotongCf = gcxJiaotongCf;
	}	

	public Integer getGcxSwjCf() {
		return gcxSwjCf;
	}

	public void setGcxSwjCf(Integer gcxSwjCf) {
		this.gcxSwjCf = gcxSwjCf;
	}	

	public Integer getGcxGajCf() {
		return gcxGajCf;
	}

	public void setGcxGajCf(Integer gcxGajCf) {
		this.gcxGajCf = gcxGajCf;
	}	

	public Integer getGcxHbjCf() {
		return gcxHbjCf;
	}

	public void setGcxHbjCf(Integer gcxHbjCf) {
		this.gcxHbjCf = gcxHbjCf;
	}	

	public Integer getGcxJhsyCf() {
		return gcxJhsyCf;
	}

	public void setGcxJhsyCf(Integer gcxJhsyCf) {
		this.gcxJhsyCf = gcxJhsyCf;
	}	

	public Integer getGcxNyjCf() {
		return gcxNyjCf;
	}

	public void setGcxNyjCf(Integer gcxNyjCf) {
		this.gcxNyjCf = gcxNyjCf;
	}	

	public Integer getGcxLyjCf() {
		return gcxLyjCf;
	}

	public void setGcxLyjCf(Integer gcxLyjCf) {
		this.gcxLyjCf = gcxLyjCf;
	}	

	public Integer getGcxLinyejuCf() {
		return gcxLinyejuCf;
	}

	public void setGcxLinyejuCf(Integer gcxLinyejuCf) {
		this.gcxLinyejuCf = gcxLinyejuCf;
	}	

	public Integer getGcxGsxzgljCf() {
		return gcxGsxzgljCf;
	}

	public void setGcxGsxzgljCf(Integer gcxGsxzgljCf) {
		this.gcxGsxzgljCf = gcxGsxzgljCf;
	}	

	public Integer getGcxSjjCf() {
		return gcxSjjCf;
	}

	public void setGcxSjjCf(Integer gcxSjjCf) {
		this.gcxSjjCf = gcxSjjCf;
	}	

	public Integer getGcxGtzyjCf() {
		return gcxGtzyjCf;
	}

	public void setGcxGtzyjCf(Integer gcxGtzyjCf) {
		this.gcxGtzyjCf = gcxGtzyjCf;
	}	

	public Integer getGcxZljdjCf() {
		return gcxZljdjCf;
	}

	public void setGcxZljdjCf(Integer gcxZljdjCf) {
		this.gcxZljdjCf = gcxZljdjCf;
	}	

	public Integer getGcxScjdgljCf() {
		return gcxScjdgljCf;
	}

	public void setGcxScjdgljCf(Integer gcxScjdgljCf) {
		this.gcxScjdgljCf = gcxScjdgljCf;
	}	

	public Integer getGcxSpypCf() {
		return gcxSpypCf;
	}

	public void setGcxSpypCf(Integer gcxSpypCf) {
		this.gcxSpypCf = gcxSpypCf;
	}	

	public Integer getGcxCzjCf() {
		return gcxCzjCf;
	}

	public void setGcxCzjCf(Integer gcxCzjCf) {
		this.gcxCzjCf = gcxCzjCf;
	}	

	public Integer getGcxDsjCf() {
		return gcxDsjCf;
	}

	public void setGcxDsjCf(Integer gcxDsjCf) {
		this.gcxDsjCf = gcxDsjCf;
	}	

	public Integer getGcxWjjCf() {
		return gcxWjjCf;
	}

	public void setGcxWjjCf(Integer gcxWjjCf) {
		this.gcxWjjCf = gcxWjjCf;
	}	

	public Integer getGcxZfcxjsjCf() {
		return gcxZfcxjsjCf;
	}

	public void setGcxZfcxjsjCf(Integer gcxZfcxjsjCf) {
		this.gcxZfcxjsjCf = gcxZfcxjsjCf;
	}	

	public Integer getGcxRlzyshbzjCf() {
		return gcxRlzyshbzjCf;
	}

	public void setGcxRlzyshbzjCf(Integer gcxRlzyshbzjCf) {
		this.gcxRlzyshbzjCf = gcxRlzyshbzjCf;
	}	

	public Integer getGcxWhjCf() {
		return gcxWhjCf;
	}

	public void setGcxWhjCf(Integer gcxWhjCf) {
		this.gcxWhjCf = gcxWhjCf;
	}	

	public Integer getGcxScxzzfCf() {
		return gcxScxzzfCf;
	}

	public void setGcxScxzzfCf(Integer gcxScxzzfCf) {
		this.gcxScxzzfCf = gcxScxzzfCf;
	}	

	public Integer getGcxCbjCf() {
		return gcxCbjCf;
	}

	public void setGcxCbjCf(Integer gcxCbjCf) {
		this.gcxCbjCf = gcxCbjCf;
	}	

	public Integer getGcxTyjCf() {
		return gcxTyjCf;
	}

	public void setGcxTyjCf(Integer gcxTyjCf) {
		this.gcxTyjCf = gcxTyjCf;
	}	

	public Integer getGcxGdjCf() {
		return gcxGdjCf;
	}

	public void setGcxGdjCf(Integer gcxGdjCf) {
		this.gcxGdjCf = gcxGdjCf;
	}	

	public Integer getGcxDsjcfCf() {
		return gcxDsjcfCf;
	}

	public void setGcxDsjcfCf(Integer gcxDsjcfCf) {
		this.gcxDsjcfCf = gcxDsjcfCf;
	}	

	public Integer getGcxYczmjCf() {
		return gcxYczmjCf;
	}

	public void setGcxYczmjCf(Integer gcxYczmjCf) {
		this.gcxYczmjCf = gcxYczmjCf;
	}	

	public Integer getGcxXmjCf() {
		return gcxXmjCf;
	}

	public void setGcxXmjCf(Integer gcxXmjCf) {
		this.gcxXmjCf = gcxXmjCf;
	}	

	public Integer getGcxBjjCf() {
		return gcxBjjCf;
	}

	public void setGcxBjjCf(Integer gcxBjjCf) {
		this.gcxBjjCf = gcxBjjCf;
	}	

	public Integer getGcxHgCf() {
		return gcxHgCf;
	}

	public void setGcxHgCf(Integer gcxHgCf) {
		this.gcxHgCf = gcxHgCf;
	}	

	public Integer getGcxCgCf() {
		return gcxCgCf;
	}

	public void setGcxCgCf(Integer gcxCgCf) {
		this.gcxCgCf = gcxCgCf;
	}	

	public Integer getGcxMfjCf() {
		return gcxMfjCf;
	}

	public void setGcxMfjCf(Integer gcxMfjCf) {
		this.gcxMfjCf = gcxMfjCf;
	}	

	public Integer getGcxQxjCf() {
		return gcxQxjCf;
	}

	public void setGcxQxjCf(Integer gcxQxjCf) {
		this.gcxQxjCf = gcxQxjCf;
	}	

	public Integer getGcxAjjCf() {
		return gcxAjjCf;
	}

	public void setGcxAjjCf(Integer gcxAjjCf) {
		this.gcxAjjCf = gcxAjjCf;
	}	

	public Integer getGcxMzjCf() {
		return gcxMzjCf;
	}

	public void setGcxMzjCf(Integer gcxMzjCf) {
		this.gcxMzjCf = gcxMzjCf;
	}	

	public Integer getGcxScjCf() {
		return gcxScjCf;
	}

	public void setGcxScjCf(Integer gcxScjCf) {
		this.gcxScjCf = gcxScjCf;
	}	

	public Integer getGcxSwCf() {
		return gcxSwCf;
	}

	public void setGcxSwCf(Integer gcxSwCf) {
		this.gcxSwCf = gcxSwCf;
	}	

	public Integer getGcxYwjCf() {
		return gcxYwjCf;
	}

	public void setGcxYwjCf(Integer gcxYwjCf) {
		this.gcxYwjCf = gcxYwjCf;
	}	

	public Integer getGcxHsjCf() {
		return gcxHsjCf;
	}

	public void setGcxHsjCf(Integer gcxHsjCf) {
		this.gcxHsjCf = gcxHsjCf;
	}	

	public Integer getGcxJlzmgljCf() {
		return gcxJlzmgljCf;
	}

	public void setGcxJlzmgljCf(Integer gcxJlzmgljCf) {
		this.gcxJlzmgljCf = gcxJlzmgljCf;
	}	

	public Integer getGcxYzglCf() {
		return gcxYzglCf;
	}

	public void setGcxYzglCf(Integer gcxYzglCf) {
		this.gcxYzglCf = gcxYzglCf;
	}	

	public Integer getGcxSfjCf() {
		return gcxSfjCf;
	}

	public void setGcxSfjCf(Integer gcxSfjCf) {
		this.gcxSfjCf = gcxSfjCf;
	}	

	public Integer getGcxRmfyCf() {
		return gcxRmfyCf;
	}

	public void setGcxRmfyCf(Integer gcxRmfyCf) {
		this.gcxRmfyCf = gcxRmfyCf;
	}	

	public Integer getGcxTjjCf() {
		return gcxTjjCf;
	}

	public void setGcxTjjCf(Integer gcxTjjCf) {
		this.gcxTjjCf = gcxTjjCf;
	}	

	public Integer getGcxCqjCf() {
		return gcxCqjCf;
	}

	public void setGcxCqjCf(Integer gcxCqjCf) {
		this.gcxCqjCf = gcxCqjCf;
	}	

	public Integer getGcxJyjCf() {
		return gcxJyjCf;
	}

	public void setGcxJyjCf(Integer gcxJyjCf) {
		this.gcxJyjCf = gcxJyjCf;
	}	

	public Integer getGcxRmyhCf() {
		return gcxRmyhCf;
	}

	public void setGcxRmyhCf(Integer gcxRmyhCf) {
		this.gcxRmyhCf = gcxRmyhCf;
	}	

	public Integer getGcxYjjCf() {
		return gcxYjjCf;
	}

	public void setGcxYjjCf(Integer gcxYjjCf) {
		this.gcxYjjCf = gcxYjjCf;
	}	

	public Integer getGcxLsjCf() {
		return gcxLsjCf;
	}

	public void setGcxLsjCf(Integer gcxLsjCf) {
		this.gcxLsjCf = gcxLsjCf;
	}	

	public Integer getGcxFzhggjCf() {
		return gcxFzhggjCf;
	}

	public void setGcxFzhggjCf(Integer gcxFzhggjCf) {
		this.gcxFzhggjCf = gcxFzhggjCf;
	}	

	public Integer getGcxGhhtdgljCf() {
		return gcxGhhtdgljCf;
	}

	public void setGcxGhhtdgljCf(Integer gcxGhhtdgljCf) {
		this.gcxGhhtdgljCf = gcxGhhtdgljCf;
	}	

	public Integer getGcxGwwsjdjCf() {
		return gcxGwwsjdjCf;
	}

	public void setGcxGwwsjdjCf(Integer gcxGwwsjdjCf) {
		this.gcxGwwsjdjCf = gcxGwwsjdjCf;
	}	

	public Integer getGcxWsjCf() {
		return gcxWsjCf;
	}

	public void setGcxWsjCf(Integer gcxWsjCf) {
		this.gcxWsjCf = gcxWsjCf;
	}	

	public Integer getGcxJyjyjCf() {
		return gcxJyjyjCf;
	}

	public void setGcxJyjyjCf(Integer gcxJyjyjCf) {
		this.gcxJyjyjCf = gcxJyjyjCf;
	}	

	public Integer getGcxYsjCf() {
		return gcxYsjCf;
	}

	public void setGcxYsjCf(Integer gcxYsjCf) {
		this.gcxYsjCf = gcxYsjCf;
	}	

	public Integer getGcxLygljCf() {
		return gcxLygljCf;
	}

	public void setGcxLygljCf(Integer gcxLygljCf) {
		this.gcxLygljCf = gcxLygljCf;
	}	

	public Integer getGcxLhjCf() {
		return gcxLhjCf;
	}

	public void setGcxLhjCf(Integer gcxLhjCf) {
		this.gcxLhjCf = gcxLhjCf;
	}	

	public Integer getGcxSangwujuCf() {
		return gcxSangwujuCf;
	}

	public void setGcxSangwujuCf(Integer gcxSangwujuCf) {
		this.gcxSangwujuCf = gcxSangwujuCf;
	}	

	public Integer getGcxKyjtglCf() {
		return gcxKyjtglCf;
	}

	public void setGcxKyjtglCf(Integer gcxKyjtglCf) {
		this.gcxKyjtglCf = gcxKyjtglCf;
	}	

	public Integer getGcxTxgljCf() {
		return gcxTxgljCf;
	}

	public void setGcxTxgljCf(Integer gcxTxgljCf) {
		this.gcxTxgljCf = gcxTxgljCf;
	}	

	public Integer getGcxGhjCf() {
		return gcxGhjCf;
	}

	public void setGcxGhjCf(Integer gcxGhjCf) {
		this.gcxGhjCf = gcxGhjCf;
	}	

	public Integer getGcxYzgljCf() {
		return gcxYzgljCf;
	}

	public void setGcxYzgljCf(Integer gcxYzgljCf) {
		this.gcxYzgljCf = gcxYzgljCf;
	}	

	public Integer getGcxXxhjCf() {
		return gcxXxhjCf;
	}

	public void setGcxXxhjCf(Integer gcxXxhjCf) {
		this.gcxXxhjCf = gcxXxhjCf;
	}	

	public Integer getGcxWgxjCf() {
		return gcxWgxjCf;
	}

	public void setGcxWgxjCf(Integer gcxWgxjCf) {
		this.gcxWgxjCf = gcxWgxjCf;
	}	

	public Integer getGcxSljCf() {
		return gcxSljCf;
	}

	public void setGcxSljCf(Integer gcxSljCf) {
		this.gcxSljCf = gcxSljCf;
	}	

	public Integer getGcxGsjCf() {
		return gcxGsjCf;
	}

	public void setGcxGsjCf(Integer gcxGsjCf) {
		this.gcxGsjCf = gcxGsjCf;
	}	

	public Integer getGcxCyjlzCf() {
		return gcxCyjlzCf;
	}

	public void setGcxCyjlzCf(Integer gcxCyjlzCf) {
		this.gcxCyjlzCf = gcxCyjlzCf;
	}	

	public Integer getGcxXfCf() {
		return gcxXfCf;
	}

	public void setGcxXfCf(Integer gcxXfCf) {
		this.gcxXfCf = gcxXfCf;
	}	

	public Integer getGcxappEnvironmenPunishment() {
		return gcxappEnvironmenPunishment;
	}

	public void setGcxappEnvironmenPunishment(Integer gcxappEnvironmenPunishment) {
		this.gcxappEnvironmenPunishment = gcxappEnvironmenPunishment;
	}	

	public Integer getGcxATaxpayer() {
		return gcxATaxpayer;
	}

	public void setGcxATaxpayer(Integer gcxATaxpayer) {
		this.gcxATaxpayer = gcxATaxpayer;
	}	

	public Integer getGcxTaxLawCases() {
		return gcxTaxLawCases;
	}

	public void setGcxTaxLawCases(Integer gcxTaxLawCases) {
		this.gcxTaxLawCases = gcxTaxLawCases;
	}	

	public Integer getGcxNegativeList() {
		return gcxNegativeList;
	}

	public void setGcxNegativeList(Integer gcxNegativeList) {
		this.gcxNegativeList = gcxNegativeList;
	}	

	public Integer getGcxappBankcommitteePunish() {
		return gcxappBankcommitteePunish;
	}

	public void setGcxappBankcommitteePunish(Integer gcxappBankcommitteePunish) {
		this.gcxappBankcommitteePunish = gcxappBankcommitteePunish;
	}	

	public Integer getGcxappStockPublish() {
		return gcxappStockPublish;
	}

	public void setGcxappStockPublish(Integer gcxappStockPublish) {
		this.gcxappStockPublish = gcxappStockPublish;
	}	

	public Integer getGcxappBaojianhuiPublish() {
		return gcxappBaojianhuiPublish;
	}

	public void setGcxappBaojianhuiPublish(Integer gcxappBaojianhuiPublish) {
		this.gcxappBaojianhuiPublish = gcxappBaojianhuiPublish;
	}	

	public Integer getGcxappDishonestPeople() {
		return gcxappDishonestPeople;
	}

	public void setGcxappDishonestPeople(Integer gcxappDishonestPeople) {
		this.gcxappDishonestPeople = gcxappDishonestPeople;
	}	

	public Integer getGcxappNetloanBlacklist() {
		return gcxappNetloanBlacklist;
	}

	public void setGcxappNetloanBlacklist(Integer gcxappNetloanBlacklist) {
		this.gcxappNetloanBlacklist = gcxappNetloanBlacklist;
	}	

	public Integer getGcxappZjbDishonest() {
		return gcxappZjbDishonest;
	}

	public void setGcxappZjbDishonest(Integer gcxappZjbDishonest) {
		this.gcxappZjbDishonest = gcxappZjbDishonest;
	}	

	public Integer getGcxappZjbPersonDishonest() {
		return gcxappZjbPersonDishonest;
	}

	public void setGcxappZjbPersonDishonest(Integer gcxappZjbPersonDishonest) {
		this.gcxappZjbPersonDishonest = gcxappZjbPersonDishonest;
	}	

	public Integer getGcxappZjbQygrblxw() {
		return gcxappZjbQygrblxw;
	}

	public void setGcxappZjbQygrblxw(Integer gcxappZjbQygrblxw) {
		this.gcxappZjbQygrblxw = gcxappZjbQygrblxw;
	}	

	public Integer getLvyouZjCopBlxx() {
		return lvyouZjCopBlxx;
	}

	public void setLvyouZjCopBlxx(Integer lvyouZjCopBlxx) {
		this.lvyouZjCopBlxx = lvyouZjCopBlxx;
	}	

	public Integer getLvyouZjPerBlxx() {
		return lvyouZjPerBlxx;
	}

	public void setLvyouZjPerBlxx(Integer lvyouZjPerBlxx) {
		this.lvyouZjPerBlxx = lvyouZjPerBlxx;
	}	

	public Integer getGcxCorpJyyc() {
		return gcxCorpJyyc;
	}

	public void setGcxCorpJyyc(Integer gcxCorpJyyc) {
		this.gcxCorpJyyc = gcxCorpJyyc;
	}	

	public Integer getGcxCorpXzcf() {
		return gcxCorpXzcf;
	}

	public void setGcxCorpXzcf(Integer gcxCorpXzcf) {
		this.gcxCorpXzcf = gcxCorpXzcf;
	}	

	public String getFromTable() {
		return fromTable;
	}

	public void setFromTable(String fromTable) {
		this.fromTable = fromTable == null ? null : fromTable.trim();
	}	

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}	




}