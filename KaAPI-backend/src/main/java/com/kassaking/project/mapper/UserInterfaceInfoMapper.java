package com.kassaking.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kassaking.kaapicommon.model.entity.UserInterfaceInfo;

import java.util.List;


public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




