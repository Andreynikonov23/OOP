package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Person {
    String name() default "NoName";
    int live();
    int strength();
    int magic() default 0;
    int attack() default 0;
    int defense();
}
