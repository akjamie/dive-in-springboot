package org.akj.springboot.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplication}
 */

//@SpringBootApplication
@Slf4j
public class SpringbootApplicationBootstrap {
    public static void main(String[] args) {
        //SpringApplication.run(SpringbootApplicationBootstrap.class,args);
        //SpringApplication.run(ApplicationConfiguration.class, args);

        SpringApplication application = new SpringApplication();
        // also support xml configuration files here
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());

        application.setSources(sources);
        //application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run(args);
        ApplicationConfiguration bean = context.getBean(ApplicationConfiguration.class);
        log.info("Bean: " + bean);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {
    }

}
