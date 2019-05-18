package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks an item as not being logged into histories.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NoLogHistory {
}
