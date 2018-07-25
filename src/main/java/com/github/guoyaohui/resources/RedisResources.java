package com.github.guoyaohui.resources;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Component;

/**
 * @author 郭垚辉
 * @date 2018/7/25
 */
@Component
public class RedisResources {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisScript<Boolean> distributeLockScript;

    @PostConstruct
    public void testinit() {
        String s = UUID.randomUUID().toString();
        List<String> keyList = Arrays.asList("dddddd");

        Boolean execute = redisTemplate.execute(distributeLockScript, keyList,  s, "EX", "5", "NX","");
        System.out.println(execute);
    }

}
//    SET key-with-expire-and-NX "hello" EX 10086 NX