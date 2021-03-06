package com.adaptivecontrol.support.annotation;

// import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies the name of the category in which to group.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Category {
    String category();
}

