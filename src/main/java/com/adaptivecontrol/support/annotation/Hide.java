package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies that the item, though public, should be hidden from the list of variables.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Hide {
}
