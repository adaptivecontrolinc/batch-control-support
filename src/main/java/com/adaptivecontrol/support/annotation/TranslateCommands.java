package com.adaptivecontrol.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TranslateCommands {
    TranslateCommand[] value();
}

