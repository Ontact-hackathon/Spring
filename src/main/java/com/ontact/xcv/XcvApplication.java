package com.ontact.xcv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class XcvApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcvApplication.class, args);
    }

}
