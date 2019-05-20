package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies a translation of a command into a particular language.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TranslateCommand {
    String language();
    String longName();
    String parameters() default "";
}
