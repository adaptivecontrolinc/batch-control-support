package com.adaptivecontrol.runtime;

public class TimerUp {
    private int startTickCount;
    private int pauseInterval;
    private boolean started;
    private boolean paused;

    public TimerUp() {
    }

    public void start() {
        started = true;
        startTickCount = TickCountModule.TickCount;
        paused = false;
    }

    public void stop() {
        started = false;
    }

    public int getTimeElapsed() {
        return getTimeElapsedMs() / 1000;
    }

//    public Integer _getTimeElapsed() {
//        return Integer.valueOf(getTimeElapsed());
//    }

    public int getTimeElapsedMs() {
        int local1;
        if (!started) {
            local1 = 0;
        } else if (paused) {
            local1 = pauseInterval;
        } else {
            local1 = TickCountModule.TickCount - startTickCount;
        }
        return local1;
    }

//    Integer _getTimeElapsedMs() {
//        return Integer.valueOf(getTimeElapsedMs());
//    }

    public void pause() {
        if (!paused) {
            paused = true;
            pauseInterval = (TickCountModule.TickCount - startTickCount);
        }
    }

    public void restart() {
        if (paused) {
            startTickCount = (TickCountModule.TickCount - pauseInterval);
            paused = false;
        }
    }
}
