package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue majkel = new StudentOne();
        TaskQueue dzesika = new StudentTwo();
        TaskQueue ozi = new StudentThree();
        Mentor szymon = new Mentor("Szymon Szymon");
        Mentor lukasz = new Mentor("Lukasz NieMentor");
        majkel.registerObserver(szymon);
        dzesika.registerObserver(szymon);
        ozi.registerObserver(lukasz);

        //When
        majkel.addTask("Test1");
        dzesika.addTask("test2");
        dzesika.addTask("test3");
        ozi.addTask("test4");
        ozi.addTask("test5");

        //Then
        assertEquals(3, szymon.getUpdateCount());
        assertEquals(2, lukasz.getUpdateCount());

    }
}
