package org.akj.springboot.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.akj.springboot.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.Assert;

@ComponentScan(basePackages = "org.akj.springboot.repository")
@Slf4j
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class).web(WebApplicationType.NONE).run(args);

        MyRepository bean = context.getBean("myRepository", MyRepository.class);

        Assert.notNull(bean, "bean does not exists in application context");
        log.info("myRepository bean:" + bean);
        context.close();
    }
}
