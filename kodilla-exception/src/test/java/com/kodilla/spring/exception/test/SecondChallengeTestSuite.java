package com.kodilla.spring.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.5, 1.5)));
    }
}