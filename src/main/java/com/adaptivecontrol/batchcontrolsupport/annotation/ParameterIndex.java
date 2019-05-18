package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies the index of the parameter within a set.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ParameterIndex {
    int index();
}
