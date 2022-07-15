package com.breakyizhan.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breakyizhan.web.dao.IotDeviceMapper;
import com.breakyizhan.web.dto.IotDeviceResVo;
import com.breakyizhan.web.entity.IotDevice;
import com.breakyizhan.web.service.IotDeviceService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 设备表 服务实现类
 * </p>
 *
 * @author WangWei
 * @since 2022-02-10
 */
@Service
public class IotDeviceServiceImpl extends ServiceImpl<IotDeviceMapper, IotDevice> implements
    IotDeviceService {


}
