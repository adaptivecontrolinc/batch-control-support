package com.adaptivecontrol.support.control;

public interface ACControlCodeSubSet {
    /**
     * Gets whether a job is running right now.
     */
    boolean getIsProgramRunning();

    /**
     * Called each time a job (program) stops.
     */
    void programStop(Object history, byte[] historyBytes);

}
