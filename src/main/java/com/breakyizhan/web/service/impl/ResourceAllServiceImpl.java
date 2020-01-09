package com.breakyizhan.web.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.breakyizhan.web.common.note.ModelDescription;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import com.breakyizhan.web.common.util.CommonValue;
import com.breakyizhan.web.common.util.MyResult;
import com.breakyizhan.web.dao.GcxCountryNegativeListMapper;
import com.breakyizhan.web.model.DataClassificationCount;
import com.breakyizhan.web.model.GcxCountryNegativeList;
import com.breakyizhan.web.model.NewDataCategory;
import com.breakyizhan.web.model.ResourceAllModel;
import com.breakyizhan.web.service.ResourceAllService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author qimy
 * @Date 2018/5/16 13:46
 **/
@Service
@ModelDescription(value="国和信用资源库",key="resourceAllController")
public class ResourceAllServiceImpl implements ResourceAllService {

//    @Autowired
//    private GcxAllCorpNegativeCfMapper gcxAllCorpNegativeCfMapper;


    @Autowired
    private GcxCountryNegativeListMapper gcxCountryNegativeListMapper;

    @Autowired
    private UserRedisUtils userRedisUtils;

    public static Map<String,String> paramMap;

    static{
        paramMap = new HashMap();
        paramMap.put("GCX_JIAOTONG_CF","交通运输");
        paramMap.put("GCX_SWJ_CF","税务局");
        paramMap.put("GCX_HBJ_CF","环保局");
        paramMap.put("GCX_JHSY_CF","卫生和计划生育");
        paramMap.put("GCX_NYJ_CF","农业局");
        paramMap.put("GCX_LYJ_CF","旅游局");
        paramMap.put("GCX_LINYEJU_CF","林业局");
        paramMap.put("GCX_GSXZGLJ_CF","工商行政管理");
        paramMap.put("GCX_SJJ_CF","审计局");
        paramMap.put("GCX_ZLJDJ_CF","质量技术监督局");
        paramMap.put("GCX_SPYP_CF","食品药品");
        paramMap.put("GCX_YZGLJ_CF","邮政管理局");
        paramMap.put("GCX_XF_CF","公安消防");
    }

    @Override
    public MyResult findAllRecords(ResourceAllModel record,int pagenow,int pagesize ) {
        int limitStart = (pagenow-1)*pagesize;
        int limitEnd = pagesize;
        List<GcxCountryNegativeList> allList = gcxCountryNegativeListMapper.findAllList(record,limitStart,limitEnd);
        int count = gcxCountryNegativeListMapper.findByRecordCount(record);
        return MyResult.ok(count,allList);
    }

    @Override
    public MyResult findById(ResourceAllModel record){
        GcxCountryNegativeList result = gcxCountryNegativeListMapper.selectByPrimaryKey(record.getId());
        return MyResult.ok(result);
    }

    @Override
    public MyResult findCountDate() {
        Map<String,Integer> resultMap;
        String Mapstr = userRedisUtils.getString(CommonValue.COUNTDATEJSON);
        if(StringUtils.isNotBlank(Mapstr)){
            resultMap= JSONObject.parseObject(Mapstr,Map.class);
            return MyResult.ok(resultMap);
        }else{
            resultMap = gcxCountryNegativeListMapper.findCountDate();
            return MyResult.ok(resultMap);
        }
    }

    @Override
    public MyResult findCountByProvince() {
        List<Map<String,Integer>> resultList;
        String resultStr=userRedisUtils.getString(CommonValue.COUNTBYPROVINCEJSON);
        if(StringUtils.isNotBlank(resultStr)){
            resultList = JSONObject.parseObject(resultStr,List.class);
            return MyResult.ok(resultList);
        }
        resultList=gcxCountryNegativeListMapper.findCountByProvince();
        return MyResult.ok(resultList);
    }

    @Override
    public MyResult findLatestData() {
        List<GcxCountryNegativeList> resultList;
        String resultStr=userRedisUtils.getString(CommonValue.LATESTDATAJSON);
        if(StringUtils.isNotBlank(resultStr)){
            resultList = JSONObject.parseObject(resultStr,List.class);
            return MyResult.ok(resultList);
        }
        resultList=gcxCountryNegativeListMapper.findLatestData();
        return MyResult.ok(resultList);
    }
    @Override
    public MyResult findCountByType() {
        List<DataClassificationCount> resultList;
        String resultStr=userRedisUtils.getString(CommonValue.COUNTBYTYPEJSON);
        if(StringUtils.isNotBlank(resultStr)){
            resultList = JSONObject.parseObject(resultStr,List.class);
            return MyResult.ok(resultList);
        }
        resultList = gcxCountryNegativeListMapper.findCountByType(paramMap);
        return MyResult.ok(resultList);
    }



    @Override
    public MyResult findTopFiveData(){
        List<NewDataCategory> resultList;
        String resultStr=userRedisUtils.getString(CommonValue.TOPFIVEDATAJSON);
        if(StringUtils.isNotBlank(resultStr)){
            resultList = JSONObject.parseObject(resultStr,List.class);
            return MyResult.ok(resultList);
        }
        resultList = gcxCountryNegativeListMapper.findTopFiveData( paramMap);
        return MyResult.ok(resultList);
    }
}
