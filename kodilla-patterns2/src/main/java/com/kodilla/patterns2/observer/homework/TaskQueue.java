package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final List<String> task;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        task = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String message) {
        task.add(message);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTask() {
        return task;
    }

    public String getName() {
        return name;
    }
}