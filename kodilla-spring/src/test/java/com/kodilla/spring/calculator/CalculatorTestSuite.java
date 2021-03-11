package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(2.0, 2.5);
        double result1 = calculator.sub(10.0, 5.0);
        double result2 = calculator.mul(2.0, 2.0);
        double result3 = calculator.div(10.0, 2.0);

        //Then
        assertEquals(4.5, result);
        assertEquals(5.0, result1);
        assertEquals(4.0, result2);
        assertEquals(5.0, result3);
    }
}
