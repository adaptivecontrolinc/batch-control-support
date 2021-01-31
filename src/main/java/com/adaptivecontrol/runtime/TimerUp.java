package com.adaptivecontrol.runtime;

public class TimerUp {
    private int startTickCount_;
    private int pauseInterval_;
    private boolean started_;
    private boolean paused_;

    public TimerUp() {
    }

    public void start() {
        started_ = true;
        startTickCount_ = TickCountModule.TickCount;
        paused_ = false;
    }

    public void stop() {
        started_ = false;
    }

    public int getTimeElapsed() {
        return getTimeElapsedMs() / 1000;
    }

//    public Integer _getTimeElapsed() {
//        return Integer.valueOf(getTimeElapsed());
//    }

    public int getTimeElapsedMs() {
        int local1;
        if (!started_) {
            local1 = 0;
        } else if (paused_) {
            local1 = pauseInterval_;
        } else {
            local1 = TickCountModule.TickCount - startTickCount_;
        }
        return local1;
    }

//    Integer _getTimeElapsedMs() {
//        return Integer.valueOf(getTimeElapsedMs());
//    }

    public void pause() {
        if (!paused_) {
            paused_ = true;
            pauseInterval_ = (TickCountModule.TickCount - startTickCount_);
        }
    }

    public void restart() {
        if (paused_) {
            startTickCount_ = (TickCountModule.TickCount - pauseInterval_);
            paused_ = false;
        }
    }
}
