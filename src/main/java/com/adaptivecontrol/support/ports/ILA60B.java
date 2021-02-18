package com.adaptivecontrol.support.ports;

public interface ILA60B {
    int read(int stationNumber, String startRegister, Object values);
    int write(int stationNumber, String startRegister, Object values, int writeMode);
}

