package com.adaptivecontrol.support.ports;

public interface LA60B {
    int read(int stationNumber, String startRegister, Object values);
    int write(int stationNumber, String startRegister, Object values, int writeMode);
}

