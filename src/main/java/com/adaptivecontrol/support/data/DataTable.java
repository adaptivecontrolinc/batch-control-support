package com.adaptivecontrol.support.data;

import org.jetbrains.annotations.NotNull;

public interface DataTable {
    @NotNull DataRowCollection getRows();
}
