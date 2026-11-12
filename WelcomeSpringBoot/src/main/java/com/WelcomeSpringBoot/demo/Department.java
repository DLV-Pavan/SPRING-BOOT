package com.WelcomeSpringBoot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Department {
    
    @Value("Pavan")
    private String dname;
    
    @Value("hyderabad")
    private String location;
}
