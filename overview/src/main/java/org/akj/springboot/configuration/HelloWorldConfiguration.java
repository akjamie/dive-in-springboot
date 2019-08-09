package org.akj.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "hello world,2020";
    }
}
