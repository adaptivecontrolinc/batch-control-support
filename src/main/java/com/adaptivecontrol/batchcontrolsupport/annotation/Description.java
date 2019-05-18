package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a description.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String description();
}

