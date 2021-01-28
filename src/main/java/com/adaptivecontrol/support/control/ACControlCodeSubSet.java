package com.adaptivecontrol.support.control;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

@Keep
public interface ACControlCodeSubSet {
    /**
     * Gets whether a job is running right now.
     */
    boolean getIsProgramRunning();

    /**
     * Called each time a job (program) stops.
     */
    void programStop(@Nullable Object history, @Nullable byte[] historyBytes);

}
