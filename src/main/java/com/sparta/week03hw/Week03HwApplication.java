package com.sparta.week03hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Week03HwApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week03HwApplication.class, args);
    }

}
