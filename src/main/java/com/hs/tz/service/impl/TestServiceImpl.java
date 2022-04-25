package com.hs.tz.service.impl;

import com.hs.tz.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class TestServiceImpl implements TestService {
    @Autowired
    RedisTemplate template;

    @Override
    public String test() {
        template.opsForValue().set("test", "luo");
        return null;
    }
}
