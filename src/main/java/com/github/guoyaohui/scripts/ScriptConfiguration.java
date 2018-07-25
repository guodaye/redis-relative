package com.github.guoyaohui.scripts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

/**
 * @author 郭垚辉
 * @date 2018/7/25
 */
@Configuration
public class ScriptConfiguration {

    @Bean
    public RedisScript<Boolean> distributeLockScript() {
        DefaultRedisScript<Boolean> script = new DefaultRedisScript<>();
        ClassPathResource resource = new ClassPathResource("distribute-lock/distribute-lock.lua");
        script.setScriptSource(new ResourceScriptSource(resource));
        script.setResultType(Boolean.class);
        return script;
    }


}
