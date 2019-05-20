package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a translation of the item's name into a particular language.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Translate {
    String language();
    String translation();
}
