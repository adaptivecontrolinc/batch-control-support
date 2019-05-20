package com.adaptivecontrol.support.control;

public interface ICommand {
    boolean getIsOn();

    boolean start(int... params);

    boolean run();

    void cancel();

    void parametersChanged(int... params);
}