package com.SPRINGBOOT_MVC.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.SPRINGBOOT_MVC.CONTROLLER",
    "com.Springbootmvc"
})
@EnableJpaRepositories(basePackages = "com.Springbootmvc.repo")
@EntityScan(basePackages = "com.Springbootmvc.model")
public class SpringbootMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMvcApplication.class, args);
        System.out.println("Spring started");
    }
}
