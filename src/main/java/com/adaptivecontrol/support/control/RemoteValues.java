package com.adaptivecontrol.support.control;

import org.jetbrains.annotations.Nullable;

public interface RemoteValues {
    /**
     * Sets values for properties of given names.
     * For example:
     *     setValues("Var1", 46, "Var2", "Abc")
     * Performed asynchronously, so it is not possible to tell whether the method succeeded.
     */
    void setValues(@Nullable Object ...namesAndValues);

    /**
     * Gets the latest values of a property.
     * 'name' is the zero-based index of the property, based on the order the properties were named in the call to CreateRemoteValues.
     */
    @Nullable Object value(int index);

    /**
     * Gets whether the last refresh of the values went ok.
     * As long as the values have been refreshed successfully at least once, then it is ok to call 'Value'.
     */
    boolean getLastOK();
}
