package org.akj.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditonalOnSystemProperty.class.getName());
        String name = String.valueOf(attributes.get("name"));

        Boolean value = Boolean.valueOf(System.getProperty(name));

        return value;
    }
}
