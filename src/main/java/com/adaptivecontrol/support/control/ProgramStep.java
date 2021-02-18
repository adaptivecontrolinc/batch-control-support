package com.adaptivecontrol.support.control;

public interface ProgramStep {
    String getCommand();
    String getNotes();
    void setNotes(String value);
    int getParameterCount();
    String getParameter(int ofs);
    long getTotalTime();
    long getElapsed();
    long getExtraTime();
    int getTemperatureAfter();
    int getIpLevel();
    String getProgramNumber();
    int getStepNumber();
    long getTimeInStep();
}
