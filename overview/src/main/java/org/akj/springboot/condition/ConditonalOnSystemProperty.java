package org.akj.springboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * {@link Conditional} that checks if the specified properties have a specific value
 *
 * @author jamie
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditonalOnSystemProperty {

    /**
     * system property name
     *
     * @return
     */
    String name();

    /**
     * system property value
     * @return
     */
    String value() default "";
}
