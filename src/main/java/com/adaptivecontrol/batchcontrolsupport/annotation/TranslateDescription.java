package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a translation of the item's description into a particular language.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TranslateDescription {
    String language();
    String description();
}
