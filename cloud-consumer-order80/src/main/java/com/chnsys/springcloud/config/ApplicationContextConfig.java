package com.chnsys.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author W
 * @version 1.0
 * @description TODO
 * @date 2021/5/9 20:44
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 向容器中注入一个RestTemplate来进行http的调用测试
     *
     * @return restTemplate
     */
    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
