package com.breakyizhan.web.dao;



import com.breakyizhan.web.model.DataClassificationCount;
import com.breakyizhan.web.model.GcxCountryNegativeList;
import com.breakyizhan.web.model.NewDataCategory;
import com.breakyizhan.web.model.ResourceAllModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GcxCountryNegativeListMapper {


    List<GcxCountryNegativeList> findAllList(@Param("record") ResourceAllModel record, @Param("start") int limitStart, @Param("end") int limitEnd);

    int findByRecordCount(@Param("record") ResourceAllModel record);

    GcxCountryNegativeList selectByPrimaryKey(@Param("id") int id);

    Map<String,Integer> findCountDate();

    List<Map<String,Integer>>  findCountByProvince();

    List<DataClassificationCount> findCountByType(@Param("map") Map<String, String> paramMap);

    List<NewDataCategory> findTopFiveData(@Param("map") Map<String, String> paramMap);

    List<GcxCountryNegativeList> findLatestData();

}