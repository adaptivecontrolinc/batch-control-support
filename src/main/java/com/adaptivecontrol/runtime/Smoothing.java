package com.adaptivecontrol.runtime;

public class Smoothing {
    private int[] values;
    private int count;
    private int firstOfs;
    private long sum;

    public Smoothing() {
    }

    public int smooth(int value, int smoothing) {
        if (smoothing < 2)
            return value;
        if ((values == null) || (values.length != smoothing)) {
            values = new int[smoothing - 1 + 1];
            count = 0;
            firstOfs = 0;
        }
        sum += value;
        if (count < smoothing) {
            values[count] = value;
            count += 1;
        } else {
            sum -= values[firstOfs];
            values[firstOfs] = value;
            firstOfs += 1;
            if (firstOfs == count) {
                firstOfs = 0;
            }
        }
        return (int) (sum / count);
    }

    public short smooth(short value, int smoothing) {
        return (short) smooth((int) value, smoothing);
    }
}
