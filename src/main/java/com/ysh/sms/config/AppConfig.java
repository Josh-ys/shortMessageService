package com.ysh.sms.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author yangshenghong
 * @date 2018/05/27 14:55
 */
@Getter
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Value("${alibaba-dayu-accessKeyId}")
    private String accessKeyId;

    @Value("${alibaba-dayu-accessKeySecret}")

    private String accessKeySecret;

    public String getValue(String key) {
        return environment.getProperty(key);
    }

    public <T> T getValue(String key, Class<T> clazz) {
        return environment.getProperty(key, clazz);
    }
}
