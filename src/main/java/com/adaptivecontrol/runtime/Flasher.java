package com.adaptivecontrol.runtime;

public class Flasher {
    private int startTime;

    public Flasher() {
    }

    public boolean flash(boolean variable, int onMilliSeconds) {
        return flash(variable, onMilliSeconds, onMilliSeconds);
    }

    public boolean flash(boolean variable, int onMilliSeconds, int offMilliSeconds) {
        int local1 = 0;
        if (startTime == 0) {
            startTime = TickCountModule.TickCount;
        } else {
            local1 = TickCountModule.TickCount - startTime;
        }
        return local1 % (onMilliSeconds + offMilliSeconds) < onMilliSeconds;
    }
}
