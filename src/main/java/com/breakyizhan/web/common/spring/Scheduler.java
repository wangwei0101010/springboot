package com.breakyizhan.web.common.spring;

import com.alibaba.fastjson.JSONObject;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import com.breakyizhan.web.common.util.CommonValue;
import com.breakyizhan.web.model.GcxCountryNegativeList;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class Scheduler {

	    @Resource
        private  UserRedisUtils userRedisUtils;

	    @Scheduled(cron="0 0/5 * * * ?")//一分钟执行一次
	    public void redisScheduler() {


            long startTime = System.currentTimeMillis();





            long end = System.currentTimeMillis();
            log.info("执行耗时》》》》》》"+(end-startTime)+"ms");
	    }
}
