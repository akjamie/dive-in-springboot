package org.akj.springboot.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.akj.springboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "org.akj.springboot.service")
@Slf4j
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        log.info("the result of sum[0..10] is:" + calculateService.calculate(1,2,3,4,5,6,7,8,9,10));

        context.close();
    }
}
