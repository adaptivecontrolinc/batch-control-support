package com.adaptivecontrol.support.control;

public final class Support {
    public static int mulDiv(int value, int multiply, int divide) {
        return divide == 0 ? 0 : (int) (((long) value) * multiply / divide);
    }

    public static short mulDiv(short value, int multiply, int divide) {
        return divide == 0 ? 0 : (short) (((int) value) * multiply / divide);
    }

    public static int reScale(int value, int inMin, int inMax, int outMin, int outMax) {
        int local1;
        if (inMin == inMax) {
            local1 = 0;
        } else {
            if (value < inMin) {
                value = inMin;
            }
            if (value > inMax) {
                value = inMax;
            }
            local1 = mulDiv(value - inMin, outMax - outMin, inMax - inMin) + outMin;
        }
        return local1;
    }

    public static short reScale(short value, int inMin, int inMax, int outMin, int outMax) {
        return (short) reScale((int) value, inMin, inMax, outMin, outMax);
    }

    public static String timerString(int secs) {
        int hours = secs / 3600, minutes = (secs % 3600) / 60, seconds = secs % 60;
        return (hours > 0) ?
                String.format("%02d:%02dm", hours, minutes) :
                String.format("%02d:%02ds", minutes, seconds);
    }

    public static int getPercent(int value, int minValue, int maxValue) {
        int range = maxValue - minValue;
        return (range == 0) ? -1 :
                Math.min(Math.max((value - minValue) * 1000 / range, 0), 1000);
    }

    public static long getPercent(long value, long minValue, long maxValue) {
        long range = maxValue - minValue;
        return (range == 0L) ? -1L :
                Math.min(Math.max((value - minValue) * 1000L / range, 0L), 1000L);
    }
}
