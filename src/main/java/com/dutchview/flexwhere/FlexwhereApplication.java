package com.dutchview.flexwhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class FlexwhereApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexwhereApplication.class, args);
    }

}
