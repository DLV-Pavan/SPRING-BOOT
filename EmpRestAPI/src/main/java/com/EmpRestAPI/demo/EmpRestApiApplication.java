package com.EmpRestAPI.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.RestApi",
    "com.EmpRestAPI"
})
@EnableJpaRepositories(basePackages = "com.EmpRestAPI.repository")
@EntityScan(basePackages = "com.EmpRestAPI.model")
public class EmpRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpRestApiApplication.class, args);
    }
}