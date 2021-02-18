package com.adaptivecontrol.runtime;

public class Timer {
    private int interval;
    private int startTickCount;
    private int pauseTickCount;
    private boolean paused;
    private boolean finished;

    public Timer() {
    }

   // TimeRemaining and Seconds are identical
    public int getSeconds() {
        return getTimeRemaining();
    }
    public void setSeconds(int value) {
        setTimeRemaining(value);
    }

    public int getTimeRemaining() {
        return (getTimeRemainingMs() + 999) / 1000;
    }

//    public Integer _getTimeRemaining() {
//        return getTimeRemaining();
//    }

    public void setTimeRemaining(int value) {
        setTimeRemainingMs(value * 1000);
    }

    public int getTimeRemainingMs() {
        int local1;
        int local2;
        if (getFinished()) {
            local1 = 0;
        } else {
            if (paused) {
                local2 = pauseTickCount;
            } else {
                local2 = TickCountModule.TickCount;
            }
            local1 = interval - (local2 - startTickCount);
        }
        return local1;
    }

//    Integer _getTimeRemainingMs() {
//        return getTimeRemainingMs();
//    }

    public void setTimeRemainingMs(int value) {
        interval = value;
        startTickCount = TickCountModule.TickCount;
        paused = false;
        finished = false;
    }

    public boolean getFinished() {
        if (!finished && !paused && TickCountModule.TickCount - startTickCount >= interval) {
            finished = true;
        }
        return finished;
    }

//    Boolean _getFinished() {
//        return getFinished();
//    }

    protected void checkFinished() {
        if (!paused && TickCountModule.TickCount - startTickCount >= interval) {
            finished = true;
        }
    }

    public void pause() {
        if (!getFinished() && !paused) {
            paused = true;
            pauseTickCount = TickCountModule.TickCount;
        }
    }

    public void restart() {
        int local1;
        if (!finished && paused) {
            local1 = TickCountModule.TickCount - pauseTickCount;
            startTickCount += local1;
            paused = false;
        }
    }

    public void cancel() {
        setTimeRemainingMs(0);
    }
}
