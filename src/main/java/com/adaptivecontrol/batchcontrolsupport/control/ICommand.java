package com.adaptivecontrol.libwhynot.control;

public interface ICommand {
    boolean getIsOn();

    boolean start(int... params);

    boolean run();

    void cancel();

    void parametersChanged(int... params);
}