package com.adaptivecontrol.support.control;


import com.adaptivecontrol.support.data.DataTable;
import com.adaptivecontrol.support.ports.LA60B;
import com.adaptivecontrol.support.ports.Stream;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.List;

public interface ACParent {
    /**
     * Gets the acknowledgment state  - one of the {@link AckState} values.
     */
    int getAckState();

    /**
     * Gets the text currently showing on the button used for messages.
     */
    @NotNull
    String getButtonText();

    /**
     * Gets or sets a message for the operator.
     * Becomes an empty string again when the operator acknowledges the message.
     */
    @NotNull
    String getSignal();

    void setSignal(@NotNull String value);

    /**
     * Gets a list of unacknowledged alarms, separated by commas.
     */
    @NotNull
    String getUnacknowledgedAlarms();

    /**
     * Simulates pressing the Run, Pause, Stop, Yes and No buttons.
     * Only when the values go from false to true are they acted on.
     */
    void pressButtons(boolean run, boolean pause, boolean stop, boolean yes, boolean no);

    /**
     * Simulates pressing the Forward and Backward buttons.
     * Only when the values go from false to true are they acted on.
     */
    void pressForwardBackward(boolean forward, boolean backward);

    /**
     * Gets whether a job is running right now. You can also get this by checking the Running property.
     */
    boolean getIsProgramRunning();

    /**
     * Gets whether a job is running right now, but has been paused. You can also get this by checking the Running var.
     */
    boolean getIsPaused();

    /**
     * Gets whether there is an unacknowledged signal.
     */
    boolean getIsSignalUnacknowledged();

    /**
     * Gets whether there is an alarm.
     */
    boolean getIsAlarmActive();

    /**
     * Gets whether there is an unacknowledged alarm.
     */
    boolean getIsAlarmUnacknowledged();

    /**
     * Gets a message.
     */
    @NotNull
    String getMessage(int messageNumber);

    /**
     * Gets or sets the running mode - the ordinal of one of the {@link Mode} values.
     */
    int getMode();

    void setMode(int value);

    /**
     * Gets the number of the program that the sequencer has reached.
     * This will change if the sequencer is paused and the step is being changed.
     * Watch out - if program numbers can be strings, then this will have to return 0.
     */
    int getProgramNumber();

    /**
     * Gets the number of the program that the sequencer has reached.
     * This will change if the sequencer is paused and the step is being changed.
     */
    @NotNull
    String getProgramNumberAsString();

    /**
     * Gets the name of the program that the sequencer has reached.
     * This will change if the sequencer is paused and the step is being changed.
     */
    @NotNull
    String getProgramName();

    /**
     * Gets the number of the step that the sequencer has reached.
     * This will change if the sequencer is paused and the step is being changed.
     */
    int getStepNumber();

    /**
     * Gets the text of the step that the sequencer has reached.
     * This will change if the sequencer is paused and the step is being changed.
     */
    @NotNull
    String getStepText();

    /**
     * Gets the time that the sequencer has spent in the current step versus how long it is supposed to spend there in total.
     * For example, "10 / 15" means 10 minutes out of an expected total of 15 minutes.
     */
    @NotNull
    String getTimeInStep();

    /**
     * Gets the current step number, relative to all steps in all programs.
     */
    int getCurrentStep();

    /**
     * Gets the current changing step number, relative to all steps in all programs.
     */
    int getChangingStep();

    /**
     * Gets the name of the job being run.
     */
    @NotNull
    String getJob();

    /**
     * Gets information for all steps, prefixed by extra information.
     */
    @NotNull
    String getPrefixedSteps();

    /**
     * Gets information for all messages.
     */
    @NotNull
    String getMessages();

    /**
     * Gets information for all programs.
     */
    @NotNull
    String getPrograms();

    /**
     * Gets information for time in steps.
     */
    @NotNull
    String getTimeInSteps();

    /**
     * Gets the time elapsed since the job started.
     */
    long getElapsedTime();

    /**
     * Gets the time that should have elapsed since the job started.
     */
    long getElapsedTimeExpected();

    /**
     * Gets the time remaining until the job ends.
     */
    long getRemainingTime();

    /**
     * Gets the numbers of all programs that were specified when the current job was started.
     */
    @NotNull
    List<Integer> getProgramNumbers();

    /**
     * Gets the names of all active alarms, separated by commas.
     */
    @NotNull
    String getActiveAlarms();

    /**
     * Gets whether the system is sleeping.
     */
    boolean isSleeping();

    /**
     * Gets the name of our own control system.
     */
    @NotNull
    String getControlSystemName();

    /**
     * Gets the number of our own control system, relative to others, starting from 1.
     */
    int getControlSystemNumber();

    /**
     * Gets the 'ControlCode' instance of another control system.
     */
    @NotNull
    Object getControlSystem(int index);

    /**
     * Gets the total number of control systems.
     */
    int getControlSystemCount();

    /**
     * Gets the 'ControlCode' instance of the control system that is the master of coupling.
     * Returns null if our control system is not coupled.  Also returns null if our control system is coupled, and we are ourself the master.
     */
    @Nullable
    Object getCouplingMaster();

    /**
     * Gets whether we are running in coupled mode.
     */
    boolean getCoupled();

    /**
     * Gets the coupling combination number, starting from 1, or 0 if not coupled.
     */
    int getCouplingCombination();

    /**
     * Gets whether the current coupled function is ready.
     */
    boolean getCouplingReady();

    /**
     * Sets whether the current coupled function is ready.
     */
    void setCouplingReady(boolean value);

    /**
     * Gets whether the current coupled function is ready for all coupled control systems.
     */
    boolean getCouplingAllReady();

    boolean getCouplingReady2();

    void setCouplingReady2(boolean value);

    boolean getCouplingAllReady2();

    boolean getCouplingReady3();

    void setCouplingReady3(boolean value);

    boolean getCouplingAllReady3();

    boolean getCouplingSafe();

    void setCouplingSafe(boolean value);

    boolean getCouplingAllSafe();

    boolean getCouplingSafe2();

    void setCouplingSafe2(boolean value);

    boolean getCouplingAllSafe2();

    boolean getCouplingSafe3();

    void setCouplingSafe3(boolean value);

    boolean getCouplingAllSafe3();

    /**
     * Adds a button to one of the main toolbars.
     */
    void addButton(@NotNull Object button, int position, @Nullable Object view);

    /**
     * Adds a standard button (like Variables) to one of the main toolbars.
     * If used with button, then the following options can be used for the program window:  Pause=1, Run=2, ChangeStep=4,Stop=8, YesOrNo=16, Halt=32.
     */
    void addStandardButton(int button, int position, @Nullable String text, int options);

    /**
     * Presses a button on one of the main toolbars.
     */
    void pressButton(int position, int index);

    /**
     * Makes a button on one of the main toolbars visible or not visible.
     */
    void setButtonVisible(int position, int index, boolean visible);

    /**
     * Makes the expert button visible or not visible.
     */
    void setExpertButtonVisible(boolean visible);

    /**
     * Set a non-standard status view to show at the top of each standard window.
     */
    void setStatusView(@Nullable Object value);

    /**
     * Executes an SQL statement against the control system database and returns data in a DataTable.
     */
    @NotNull
    DataTable dbGetDataTable(@NotNull String sql);

    /**
     * Executes an SQL statement against the control system database.
     * Returns the number of rows affected.
     */
    int dbExecute(@NotNull String sql, @NotNull Object... params);

    /**
     * Makes a String suitable for use in an SQL statement from the given value.
     */
    @NotNull
    String dbSqlString(@Nullable Object value);

    /**
     * Updates the schema of the control system database with the given SQL schema text.
     */
    void dbUpdateSchema(@NotNull String sql);

    /**
     * Starts a job running.
     */
    void startJob(@NotNull String jobName, @NotNull Object dataId, @NotNull int[] programNumbers, @Nullable String[] substituteSteps);

    /**
     * Starts a job running.
     * Thread safe.
     */
    void startJob(@NotNull String jobName, @NotNull Object dataId, @NotNull String[] steps);

    /**
     * Stops a job.
     */
    void stopJob();

    /**
     * Prevents standard database schema activities.
     */
    void nonStandardDb();

    /**
     * Creates a standard view.
     * 'typeName' should be one of "History", "Variables", "IO" or "Parameters"
     */
    @Nullable
    Object createView(@NotNull String typeName);

    /**
     * Creates a history from serialized data.
     */
    @Nullable
    Object createHistory(@Nullable byte[] bytes);

    /**
     * Creates a proxy to a object of type 'ControlCode' found at the given data source.
     */
    @Nullable
    Object createControlCodeProxy(@NotNull Object dataSource);

    /**
     * Creates a proxy to a object of given type found at the given data source.
     */
    @Nullable
    Object createProxy(@NotNull Type classToProxy, @NotNull Object dataSource);

    /**
     * Creates an instance of RemoteValues that can read and write the variables in a control system.
     */
    @NotNull
    RemoteValues createRemoteValues(@NotNull String connect, int autoRefreshInterval, @NotNull String... properties);

    /**
     * Logs an event to the control system log file.
     */
    void logEvent(int eventType, @NotNull Object id, @NotNull String message);

    /**
     * Logs an exception to the control system log file.
     */
    void logException(@NotNull Exception exception);

    /**
     * Gets the value of a setting (from the control system setup file).
     * Returns the value of the setting, or an empty string if the name is not found.
     */
    @NotNull
    String getSetting(@NotNull String name);

    /**
     * Sets the channel number of an IO variable to a different value.  Use 0 to hide the variable.
     */
    void setIOChannel(@NotNull String name, int channel);

    /**
     * Gets the number of io items.
     */
    int getIOCount();

    /**
     * Gets the name of the culture (language) for which the control system is displaying text.
     */
    @NotNull
    String getCultureName();

    /**
     * Sets the name of the culture (language) for which the control system is displaying text.
     */
    void setCultureName(@NotNull String value);

    /**
     * Gets the data found in the attached dongle, if any.
     */
    @Nullable
    byte[] getDongleBytes();

    /**
     * Sets the visibility of the operator toolbar at the bottom.
     */
    void setOperatorToolbarVisible(boolean value);

    @NotNull
    String getForces();

    void setForces(@NotNull String value);

    @Nullable
    Object addSequencerToNetwork(@NotNull String name, @NotNull Object component);

    void setBlockAll(boolean value);

    /**
     * Gets whether some UI functions are locked out at the request of Plant Explorer.
     */
    boolean getLocked();

    int getProgramStepCount();

    @NotNull
    ProgramStep programStep(int index);

    @NotNull
    String getJobAsHtml();

    /**
     * Gets the sequencer for this control system.
     */
    @NotNull
    Object getControlSequencer();

    /**
     * If the value of any of the machine parameters is changed, then returns True once.
     * Also returns True once at startup.
     */
    boolean getParametersChanged();

    /**
     * If Yes is pressed, returns true once.
     */
    boolean getYesPressed();

    /**
     * If No is pressed, returns true once.
     */
    boolean getNoPressed();

    /**
     * Sets whether values for a variable of the given name will be logged in histories.
     */
    void setLogHistory(@NotNull String name, boolean log);

    /**
     * Sets how often data is logged to a history - use TimeSpan.MinValue for continuous logging.
     */
    void setHistoryLogInterval(long value);

    boolean getUnableToStart();

    /**
     * Gets the current temperature of the CPU in tenths of a degree C, so 354 is 35.4C
     */
    int getCpuTemperature();

    Stream newSerialPort(@NotNull String portName, int baudRate, int parity,
                                  int dataBits, int stopBits);

    Stream newNetworkPort(@NotNull String hostname, int port);

    LA60B newLA60B(@NotNull Stream stream);
}