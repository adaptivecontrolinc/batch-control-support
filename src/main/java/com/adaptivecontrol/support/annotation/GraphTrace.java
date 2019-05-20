package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GraphTrace {
    int minimumValue();
    int maximumValue();
    int minimumY();
    int maximumY() default 10000;
    String colorName() default "";
    String format() default "";
}
