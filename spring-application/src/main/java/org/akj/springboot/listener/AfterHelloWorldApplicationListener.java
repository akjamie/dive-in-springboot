package org.akj.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

@Slf4j
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>,Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    log.info("AfterHelloWorld -> Application context id:" + event.getApplicationContext().getId()
            + ", timestamp:" + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
