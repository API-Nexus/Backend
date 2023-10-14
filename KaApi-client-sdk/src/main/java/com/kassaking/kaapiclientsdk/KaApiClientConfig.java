package com.kassaking.kaapiclientsdk;


import com.kassaking.kaapiclientsdk.client.KaApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("kaapi.client")
@Data
@ComponentScan
public class KaApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public KaApiClient kaApiClient(){
        return new KaApiClient(accessKey,secretKey);
    }
}
