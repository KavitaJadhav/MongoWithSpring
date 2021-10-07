package com.example.MongoWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.example.repository")
@SpringBootApplication
public class MongoWithSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoWithSpringApplication.class, args);
    }

}
