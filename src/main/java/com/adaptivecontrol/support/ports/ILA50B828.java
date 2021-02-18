package com.adaptivecontrol.support.ports;

public interface ILA50B828 {
    int writeAndRead(
            int networkNumber, boolean[] dout, short[] anout,
            boolean[] dinp, short[] temp, short[] aninp, short[] hsCounter);
}

