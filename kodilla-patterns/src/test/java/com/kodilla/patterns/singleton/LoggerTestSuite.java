package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void startLogger() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testLog() {
        //Given
        logger.log("test");
        logger.log("test1");

        //When
        String result = logger.getLastLog();

        //Then
        Assertions.assertEquals("test1", result);
    }
}
