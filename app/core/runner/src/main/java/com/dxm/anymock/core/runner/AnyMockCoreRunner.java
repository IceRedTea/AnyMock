package com.dxm.anymock.core.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = "com.dxm")
public class AnyMockCoreRunner {
    public static void main(String[] args) {
        System.setProperty("server.port", "8332");
        SpringApplication.run(AnyMockCoreRunner.class, args);
    }
}