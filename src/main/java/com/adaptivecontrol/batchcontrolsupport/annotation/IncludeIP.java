package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies that this assembly should allow IP functionality in its program editor.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface IncludeIP {
    boolean value();
}
