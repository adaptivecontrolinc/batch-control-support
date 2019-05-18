package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface IO {
    int ioType();

    int channel();

    int allowOverride() default 1;

    String device() default "";

    String format() default "";
}
