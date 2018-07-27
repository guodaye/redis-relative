package com.github.guoyaohui;

import java.util.concurrent.LinkedBlockingQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 郭垚辉
 * @date 2018/7/25
 */
@SpringBootApplication
public class RedisStartServer {

    public static void main(String[] args) {
        LinkedBlockingQueue<String> strings = new LinkedBlockingQueue<>(10);
        strings.size();
        SpringApplication.run(RedisStartServer.class, args);
    }
}
