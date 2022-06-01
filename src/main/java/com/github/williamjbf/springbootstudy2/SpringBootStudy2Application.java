package com.github.williamjbf.springbootstudy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootStudy2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudy2Application.class, args);
    }

}
