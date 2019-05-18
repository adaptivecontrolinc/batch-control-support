package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a translation of a screen button's text into a particular language.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TranslateScreenButton {
    int order();
    String language();
    String text();
}
