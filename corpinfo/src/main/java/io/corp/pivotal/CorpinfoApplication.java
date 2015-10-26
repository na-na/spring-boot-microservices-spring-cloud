package io.corp.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class CorpinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorpinfoApplication.class, args);
    }
}
