package com.adaptivecontrol.support.ports;

public interface Stream {
    void write(byte[] bytes, int count, StreamWrite callback);
    void read(byte[] bytes, int count, StreamRead callback);

    int getReadTimeOutMs();
    void setReadTimeOutMs(int value);
}

