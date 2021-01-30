package com.adaptivecontrol.support.control;

import androidx.annotation.Keep;

@Keep
public interface ACCommand {
    boolean getIsOn();

    boolean start(int... param);

    boolean run();

    void cancel();

    void parametersChanged(int... param);
}