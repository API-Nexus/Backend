package com.kassaking.kaapiinterface;

import com.kassaking.kaapiclientsdk.client.KaApiClient;
import com.kassaking.kaapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class KaApiInterfaceApplicationTests {

    @Resource
    private KaApiClient kaApiClient;
    @Test
    void contextLoads() {
        String result = kaApiClient.getNameByGet("kaka");
        User user = new User();
        user.setUsername("kakaka");
        String usernameByPost = kaApiClient.getNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);

    }

}
