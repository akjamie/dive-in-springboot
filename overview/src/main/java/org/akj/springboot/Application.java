package org.akj.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@ServletComponentScan(basePackages = "org.akj.springboot.web.servlet")
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Learning01Application.class, args);
        new SpringApplicationBuilder(Application.class).run(args);
    }

}
