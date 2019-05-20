package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies the valid range of values for a parameter variable.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Parameter {
    int minimumValue();
    int maximumValue();
}
