package com.ysh.sms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void sms() {
        Map<String, String> map = new HashMap<>();
        map.put("mobile", "test phone");
        map.put("template_code", "test template");
        map.put("sign_name", "test sign_name");
        map.put("param", "{\"name\":\"name\"}");
        jmsTemplate.convertAndSend("sms", map);
    }
}
