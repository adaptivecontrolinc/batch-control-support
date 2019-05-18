package com.adaptivecontrol.libwhynot.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specifies that this control system can only run one program at a time, and so
 * for example UI's should only associate a single program number with a batch.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleProgram {
    boolean value();
}
