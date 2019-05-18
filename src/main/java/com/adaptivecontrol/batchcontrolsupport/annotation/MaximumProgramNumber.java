package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies the maximum program number allowed for programs.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MaximumProgramNumber {
    int value();
}
