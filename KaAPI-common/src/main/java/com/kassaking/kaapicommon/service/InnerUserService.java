package com.kassaking.kaapicommon.service;

import com.kassaking.kaapicommon.model.entity.User;

public interface InnerUserService {

    User getInvokeUser(String accessKey);
}
