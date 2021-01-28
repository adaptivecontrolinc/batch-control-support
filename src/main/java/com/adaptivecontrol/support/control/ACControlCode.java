package com.adaptivecontrol.support.control;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

@Keep
public interface ACControlCode {
    /**
     * Called just once when the control system starts up for the first time.
     * This will be shortly after the instance constructor for the class has been called.
     * All other control systems will have been created at this time, for example.
     */
    void startUp();

    /**
     * Called just once when the control system is being shut down.  At this time,
     * there will be approximately 3 seconds remaining before readInputs(), run() and writeOutputs()
     * stop being called.
     */
    void shutDown();

    /**
     * Called to read input values into the given arrays.
     *
     * @return true if a cycle of I/O reads has completed without errors.
     */
    boolean readInputs(@NotNull boolean[] dinp, @NotNull short[] aninp, @NotNull short[] temp);

    /**
     * Called all the time to run the control.
     */
    void run();

    /**
     * Called to write output values found in the given arrays.
     */
    void writeOutputs(@NotNull boolean[] dout, @NotNull short[] anout);

    /**
     * Called to get text information for display on a screen.
     *
     * @param screen The screen number.
     * @param row    An array of 100 rows in which text can be stored. row[0] is not used.
     */
    void drawScreen(int screen, @NotNull String[] row);

    /**
     * Called each time a job (program) starts.
     */
    void programStart();

    /**
     * Called each time a job (program) stops.
     */
    void programStop();
}
