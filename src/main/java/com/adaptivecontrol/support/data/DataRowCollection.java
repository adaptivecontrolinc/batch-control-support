package com.adaptivecontrol.support.data;

import org.jetbrains.annotations.NotNull;

public interface DataRowCollection {
    int getCount();
    @NotNull DataRow getItem(int index);
}
