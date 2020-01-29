package com.binart.binartcommon.domain.events;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = {METHOD, ANNOTATION_TYPE})
@Retention(value = RUNTIME)
@Documented
public @interface DomainEventHandler {
    String type();

    String source();

    String subject();

    String[] extensions();
}
