package com.adaptivecontrol.support.control;

public class Flasher {
    private int startTime_;

    public Flasher() {
    }

    public boolean flash(boolean variable, int onMilliSeconds) {
        return flash(variable, onMilliSeconds, onMilliSeconds);
    }

    public boolean flash(boolean variable, int onMilliSeconds, int offMilliSeconds) {
        int local1 = 0;
        if (startTime_ == 0) {
            startTime_ = TickCountModule.TickCount;
        } else {
            local1 = TickCountModule.TickCount - startTime_;
        }
        return local1 % (onMilliSeconds + offMilliSeconds) < onMilliSeconds;
    }
}
