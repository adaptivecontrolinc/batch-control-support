package com.adaptivecontrol.support.control;

@SuppressWarnings("unused")
public class Timer {
    private int interval_;
    private int startTickCount_;
    private int pauseTickCount_;
    private boolean paused_;
    private boolean finished_;

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

    public Integer _getTimeRemaining() {
        return getTimeRemaining();
    }

    public void setTimeRemaining(int value) {
        setTimeRemainingMs(value * 1000);
    }

    int getTimeRemainingMs() {
        int local1;
        int local2;
        if (getFinished()) {
            local1 = 0;
        } else {
            if (paused_) {
                local2 = pauseTickCount_;
            } else {
                local2 = TickCountModule.TickCount;
            }
            local1 = interval_ - (local2 - startTickCount_);
        }
        return local1;
    }

    Integer _getTimeRemainingMs() {
        return getTimeRemainingMs();
    }

    void setTimeRemainingMs(int value) {
        interval_ = value;
        startTickCount_ = TickCountModule.TickCount;
        paused_ = false;
        finished_ = false;
    }

    boolean getFinished() {
        if (!finished_ && !paused_ && TickCountModule.TickCount - startTickCount_ >= interval_) {
            finished_ = true;
        }
        return finished_;
    }

    Boolean _getFinished() {
        return getFinished();
    }

    protected void checkFinished() {
        if (!paused_ && TickCountModule.TickCount - startTickCount_ >= interval_) {
            finished_ = true;
        }
    }

    public void pause() {
        if (!getFinished() && !paused_) {
            paused_ = true;
            pauseTickCount_ = TickCountModule.TickCount;
        }
    }

    public void restart() {
        int local1;
        if (!finished_ && paused_) {
            local1 = TickCountModule.TickCount - pauseTickCount_;
            startTickCount_ += local1;
            paused_ = false;
        }
    }

    public void cancel() {
        setTimeRemainingMs(0);
    }
}
