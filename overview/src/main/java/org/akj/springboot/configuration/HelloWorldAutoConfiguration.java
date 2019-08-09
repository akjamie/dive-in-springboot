package org.akj.springboot.configuration;

import org.akj.springboot.annotation.EnableHelloWorld;
import org.akj.springboot.condition.ConditonalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration  // Stereotype annotation injection
@EnableHelloWorld // @Enable module injection
@ConditonalOnSystemProperty(name="hello-world.enabled") // conditional injection
public @interface HelloWorldAutoConfiguration {

}
