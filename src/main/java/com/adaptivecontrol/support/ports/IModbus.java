package com.adaptivecontrol.support.ports;

public interface IModbus {
    int read(int slaveAddress, int firstRegister, Object values);
    int read6(int slaveAddress, int firstRegister, Object values);
    int write(int slaveAddress, int firstRegister, Object values, int writeMode);
    int write6(int slaveAddress, int firstRegister, Object values, int writeMode);
}

