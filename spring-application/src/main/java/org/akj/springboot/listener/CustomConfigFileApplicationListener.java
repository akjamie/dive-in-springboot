package org.akj.springboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Implement {@link org.springframework.context.ApplicationListener} for testing purpose
 * @Author Jamie Zhang
 */

public class CustomConfigFileApplicationListener implements SmartApplicationListener,Ordered {

    @Override
    public int getOrder() {
        //return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
        return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
    }

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {

            ConfigurableEnvironment environment = ((ApplicationEnvironmentPreparedEvent) event).getEnvironment();
            String name = environment.getProperty("name");
            System.out.println("environment.getProperty(\"name\"): " + name);

        }
        if (event instanceof ApplicationPreparedEvent) {
        }
    }
}
