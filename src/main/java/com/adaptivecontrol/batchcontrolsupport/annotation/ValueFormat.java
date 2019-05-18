package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a format for displaying the item's value.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ValueFormat {
    String format();
}
