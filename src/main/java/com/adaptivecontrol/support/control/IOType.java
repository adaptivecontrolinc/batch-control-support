package com.adaptivecontrol.support.control;

import androidx.annotation.Keep;

@Keep
public final class IOType {
    private IOType() {
    }

    static public final int Normal = 0;
    static public final int Timer = 1;
    static public final int Dinp = 2;
    static public final int Dout = 3;
    static public final int Aninp = 4;
    static public final int Anout = 5;
    static public final int Temp = 6;
    static public final int Pid = 7;
    static public final int Counter = 8;
}


