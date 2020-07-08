package com.xr.microservicecloudconsumerdept80.cfgbeans;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * Created By xf on 2019/9/28
 */
@Configuration

public class ConfigBean {
    @Bean
    /**
     * 使用RestTemplate远程调用REST服务
     */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}