# dive-in-springboot
## Manual Configuration vs Auto configuration
### Manual
    1. xml
    <context:annotation-config/> 激活注解特性
    <context:component-scan base-package="xxx.xx"/>扫描被@Component及其派生注解标注的类，将他们注册为spring bean
    2. Stereotype Annotation
    @Component -> @Repository @Service @Configuration @SpringBootConfiguration
    3. Conditional Annotation
    @Conditional -> onXXXCondition implements Condition
    4. Profile
    @Profile
    5. @Enable 
    @EnableXX -> @Import(xxxConfiguration) or @Import(xxxSelector implements ImportSelector)
### Auto
    1.@SpringBootApplication == @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
    2.META-INF/spring.factories