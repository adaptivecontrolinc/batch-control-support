package com.adaptivecontrol.libwhynot.control;

public final class AckState {
    private AckState() {
    }

    static public final int Off = 0;
    static public final int UnackMessage = 1;
    static public final int AckMessage = 2;
    static public final int QQ = 3;
    static public final int MessageIsDone = 4;
    static public final int QQIsDoneAndAnswerIsYes = 5;
    static public final int QQIsDoneAndAnswerIsNo = 6;
}
