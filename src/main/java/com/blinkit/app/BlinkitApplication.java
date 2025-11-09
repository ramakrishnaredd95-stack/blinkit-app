package com.blinkit.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

// Note: the SpringApplication class requires the Spring Boot dependency.
// If you intend to run this as a Spring Boot app, add the spring-boot dependency
// to your build (pom.xml or build.gradle) and restore the import above.

@SpringBootApplication
public class BlinkitApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlinkitApplication.class, args);
    }
}
