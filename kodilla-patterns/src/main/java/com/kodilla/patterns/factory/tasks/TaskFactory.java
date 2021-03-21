package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "Shopping task";
    public static final String PAINTINGTASK = "Painting task";
    public static final String DRIVINGTASK = "Driving task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask(" Shopping task", " Apple ", 10.0);
            case PAINTINGTASK:
                return new PaintingTask(" Painting task", " Black", " Wall");
            case DRIVINGTASK:
                return new DrivingTask(" Driving task", " Hospital", " Bike");
            default:
                return null;
        }

    }
}
