package com.kodilla.spring.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: Begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: End");
    }

    @DisplayName("Checking if the list is working correctly when the list is empty")

    @Test
    void testCaseEmptyList() {

        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        OddNumbersExteminator emptyExt = new OddNumbersExteminator();
        List<Integer> shouldBeEmpty = emptyExt.exterminate(emptyList);

        //Then
        assertEquals(0, shouldBeEmpty.size());
    }
    @DisplayName("Checking if the numbers list is working  correctly when it contain numbers")

    @Test
    void testCaseEvenList() {

        //Given
        List<Integer> oddList = new ArrayList<>();
        oddList.add(2);
        oddList.add(5);

        //When
        OddNumbersExteminator oddExt = new OddNumbersExteminator();
        List<Integer> shouldBeOdd = oddExt.exterminate(oddList);

        //Then
        assertEquals(1, shouldBeOdd.size());
    }
}
