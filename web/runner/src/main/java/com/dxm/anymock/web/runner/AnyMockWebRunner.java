package com.dxm.anymock.web.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "com.dxm")
public class AnyMockWebRunner {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "anymock-web-config");
        SpringApplication.run(AnyMockWebRunner.class, args);
    }
}
