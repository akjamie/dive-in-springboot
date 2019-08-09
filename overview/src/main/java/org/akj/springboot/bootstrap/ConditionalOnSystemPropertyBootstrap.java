package org.akj.springboot.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.akj.springboot.condition.ConditonalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

@Slf4j
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditonalOnSystemProperty(name="hello-world.enabled")
    public DateFormat date(){
        return new SimpleDateFormat("yyyy-MM-dd");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        DateFormat formatter = context.getBean(DateFormat.class);
        log.info("data conversion of new Date():" + formatter.format(Calendar.getInstance().getTime()));

        context.close();
    }

}
