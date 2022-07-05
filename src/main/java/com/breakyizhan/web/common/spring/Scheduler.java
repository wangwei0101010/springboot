package com.breakyizhan.web.common.spring;

import com.alibaba.fastjson.JSONObject;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import com.breakyizhan.web.common.util.CommonValue;
import com.breakyizhan.web.dao.GcxCountryNegativeListMapper;
import com.breakyizhan.web.model.DataClassificationCount;
import com.breakyizhan.web.model.GcxCountryNegativeList;
import com.breakyizhan.web.model.NewDataCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *<p>Title:Scheduler</p>
 *<p>Description:定时任务</p>
 */
@Component
public class Scheduler {

	    private final Logger logger = LoggerFactory.getLogger(this.getClass());
	    @Resource
        private  UserRedisUtils userRedisUtils;
	    @Resource
	    private GcxCountryNegativeListMapper gcxCountryNegativeListMapper;
	    @Scheduled(cron="0 0/5 * * * ?")//一分钟执行一次
	    public void redisScheduler() {


            long startTime = System.currentTimeMillis();
            Map<String, Integer> countDate = gcxCountryNegativeListMapper.findCountDate();
            List<Map<String, Integer>> countByProvince = gcxCountryNegativeListMapper.findCountByProvince();
            List<GcxCountryNegativeList> latestData = gcxCountryNegativeListMapper.findLatestData();

            String countDateJson = JSONObject.toJSON(countDate).toString();
            String countByProvinceJson = JSONObject.toJSON(countByProvince).toString();
            String latestDataJson = JSONObject.toJSON(latestData).toString();



            userRedisUtils.setString(CommonValue.COUNTDATEJSON,countDateJson);
            userRedisUtils.setString(CommonValue.COUNTBYPROVINCEJSON,countByProvinceJson);
            userRedisUtils.setString(CommonValue.LATESTDATAJSON,latestDataJson);

            long end = System.currentTimeMillis();
            logger.info("执行耗时》》》》》》"+(end-startTime)+"ms");
	    }
}
