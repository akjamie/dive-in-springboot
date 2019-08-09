package org.akj.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
public class HelloWorldApplicationRunListener implements SpringApplicationRunListener {
    private final SpringApplication application;
    private final String[] args;

    public HelloWorldApplicationRunListener(SpringApplication application, String[] args) {
        this.application = application;
        this.args = args;
    }

    @Override
    public void starting() {
        log.debug("HelloWorldApplicationRunListener: starting");
        System.out.println("HelloWorldApplicationRunListener: starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.debug("HelloWorldApplicationRunListener: environmentPrepared");
        System.out.println("HelloWorldApplicationRunListener: environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.debug("HelloWorldApplicationRunListener: contextPrepared");
        System.out.println("HelloWorldApplicationRunListener: contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.debug("HelloWorldApplicationRunListener: contextLoaded");
        System.out.println("HelloWorldApplicationRunListener: contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.debug("HelloWorldApplicationRunListener: started");
        System.out.println("HelloWorldApplicationRunListener: started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.debug("HelloWorldApplicationRunListener: running");
        System.out.println("HelloWorldApplicationRunListener: running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.debug("HelloWorldApplicationRunListener: failed");
        System.out.println("HelloWorldApplicationRunListener: failed");
    }
}
