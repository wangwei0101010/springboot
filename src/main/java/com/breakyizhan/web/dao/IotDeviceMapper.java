package com.breakyizhan.web.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.breakyizhan.web.dto.IotDeviceResVo;
import com.breakyizhan.web.entity.IotDevice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 设备表 Mapper 接口
 * </p>
 *
 * @author WangWei
 * @since 2022-02-10
 */
@Repository
public interface IotDeviceMapper extends BaseMapper<IotDevice> {



}
