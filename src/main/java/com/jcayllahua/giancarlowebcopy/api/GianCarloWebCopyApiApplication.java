package com.jcayllahua.giancarlowebcopy.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GianCarloWebCopyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GianCarloWebCopyApiApplication.class, args);
    }

}
