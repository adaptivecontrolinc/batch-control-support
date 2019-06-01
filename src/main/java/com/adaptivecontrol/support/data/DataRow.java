package com.adaptivecontrol.support.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DataRow {
    @Nullable Object getItem(int columnIndex);
    @Nullable Object getItem(@NotNull String columnName);
}
