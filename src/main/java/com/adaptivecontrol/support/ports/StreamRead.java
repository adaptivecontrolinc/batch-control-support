package com.adaptivecontrol.support.ports;

import org.jetbrains.annotations.Nullable;

public interface StreamRead {
    void callback(int red, @Nullable Throwable ex);
}
