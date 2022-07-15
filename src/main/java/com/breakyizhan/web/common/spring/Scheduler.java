package com.breakyizhan.web.common.spring;

import com.breakyizhan.web.common.redis.UserRedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
