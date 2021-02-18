package com.adaptivecontrol.support.ports;

import org.jetbrains.annotations.Nullable;

public interface StreamWrite {
    void callback(@Nullable Throwable ex);
}
