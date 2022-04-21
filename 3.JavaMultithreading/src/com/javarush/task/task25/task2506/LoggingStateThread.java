package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(state);

        State newState = null;
        do {
            if ((newState = thread.getState()) != state) {
                state = newState;
                System.out.println(state);
            }

        } while (!state.equals(State.TERMINATED));
        super.run();
    }
}
