package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Defines a button for displaying screen information.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ScreenButton {
    String text();
    int order();
    int image();
}

