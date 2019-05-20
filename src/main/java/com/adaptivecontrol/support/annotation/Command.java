package com.adaptivecontrol.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Specifies that this class is a command.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Command {
    String longName();

    String parameters() default "";

    String gradient() default "";

    String target() default "";

    String minutes() default "";

    int commandType() default 0;
}
//
//         val commandType: Int = CommandType.Standard
//        )
//
//        object CommandType {
//        const val Standard = 0
//        const val BatchParameter = 1
//        const val ParallelCommand = 2
//        }
