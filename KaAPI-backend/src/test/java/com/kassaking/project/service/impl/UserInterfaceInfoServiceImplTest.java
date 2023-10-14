package com.kassaking.project.service.impl;

import com.kassaking.project.service.UserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class UserInterfaceInfoServiceImplTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    @Test
    public void invokeCount(){
        boolean b = userInterfaceInfoService.invokeCount(1L,1);
        Assertions.assertTrue(b);
    }
}