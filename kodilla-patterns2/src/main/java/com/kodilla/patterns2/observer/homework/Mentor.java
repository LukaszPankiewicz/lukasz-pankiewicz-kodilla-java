package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue TaskQueue) {
        System.out.println(username + ": New task from: " + TaskQueue.getName() + "\n" +
                " (total: " + TaskQueue.getTask().size() + " task to check)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}