package com.adaptivecontrol.support.control;

public class Smoothing {
    private int[] values_;
    private int count_;
    private int firstOfs_;
    private long sum_;

    public Smoothing() {
    }

    public int smooth(int value, int smoothing) {
        int local1 = 0;
        if (smoothing < 2) {
            local1 = value;
        } else {
            if ((values_ == null) || (values_.length != smoothing)) {
                values_ = new int[smoothing - 1 + 1];
                count_ = 0;
                firstOfs_ = 0;
            }
            sum_ += value;
            if (count_ < smoothing) {
                values_[count_] = value;
                count_ += 1;
            } else {
                sum_ -= values_[firstOfs_];
                values_[firstOfs_] = value;
                firstOfs_ += 1;
                if (firstOfs_ == count_) {
                    firstOfs_ = 0;
                }
            }
            local1 = (int) (sum_ / count_);
        }
        return local1;
    }

    public short smooth(short value, int smoothing) {
        return (short) smooth((int) value, smoothing);
    }
}
