package com.breakyizhan.web.dao;

import com.breakyizhan.web.model.GcxAllCorpNegativeCf;
import com.breakyizhan.web.model.ResourceAllModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GcxAllCorpNegativeCfMapper {

	int findByRecordCount(@Param("record") ResourceAllModel record);


    List<GcxAllCorpNegativeCf> findAllList(ResourceAllModel record);
}