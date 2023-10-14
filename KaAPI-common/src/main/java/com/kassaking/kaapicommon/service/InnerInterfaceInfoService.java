package com.kassaking.kaapicommon.service;

import com.kassaking.kaapicommon.model.entity.InterfaceInfo;

public interface InnerInterfaceInfoService {

    InterfaceInfo getInterfaceInfo(String path, String method);
}
