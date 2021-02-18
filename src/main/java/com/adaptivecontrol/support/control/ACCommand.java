package com.adaptivecontrol.support.control;

public interface ACCommand {
    boolean getIsOn();

    boolean start(int... param);

    boolean run();

    void cancel();

    void parametersChanged(int... param);
}