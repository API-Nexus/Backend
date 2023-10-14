package com.kassaking.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kassaking.kaapicommon.model.entity.User;

import javax.servlet.http.HttpServletRequest;


public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getLoginUser(HttpServletRequest request);

    boolean isAdmin(HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);
}
