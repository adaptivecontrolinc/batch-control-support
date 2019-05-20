package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies that the item's value should be persisted while the control system is not running.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Persist {
}
