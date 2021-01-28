package com.adaptivecontrol.support.control;

import androidx.annotation.Keep;

@Keep
public interface ACCommand {
    boolean getIsOn();

    boolean start(int... params);

    boolean run();

    void cancel();

    void parametersChanged(int... params);
}