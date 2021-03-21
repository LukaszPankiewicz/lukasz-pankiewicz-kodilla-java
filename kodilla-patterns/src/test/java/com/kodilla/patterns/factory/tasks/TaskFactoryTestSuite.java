package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testTaskShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        String result = shopping.executeTask();

        //Then
        assertEquals("[Shopping task] Shopping task Apple 10.0", result);
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testTaskDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        String result = driving.executeTask();

        //Then
        assertEquals("[Driving task] Driving task Hospital Bike", result);
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testTaskPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        String result = painting.executeTask();

        //Then
        assertEquals("[Painting task] Painting task Black Wall", result);
        assertTrue(painting.isTaskExecuted());
    }
}
