package com.newsfeed.newsfeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class NewsfeedApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(NewsfeedApplication.class, args);
    }
}
