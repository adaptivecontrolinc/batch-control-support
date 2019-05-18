package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a translation of the item's category into a particular language.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TranslateCategory {
    String language();
    String category();
}
