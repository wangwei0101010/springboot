package com.breakyizhan.web.service;

import com.breakyizhan.web.common.util.MyResult;
import com.breakyizhan.web.model.ResourceAllModel;

public interface ResourceAllService {



    MyResult findAllRecords(ResourceAllModel model, int pagenow, int pagesize);


    MyResult findById(ResourceAllModel model);

    MyResult findCountDate();

    MyResult findCountByProvince();

    MyResult findLatestData();

    MyResult findCountByType();

    MyResult findTopFiveData();
}
