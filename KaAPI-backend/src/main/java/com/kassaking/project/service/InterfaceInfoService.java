package com.kassaking.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kassaking.kaapicommon.model.entity.InterfaceInfo;

public interface InterfaceInfoService extends IService<InterfaceInfo> {

    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
