package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void before() {
        System.out.println("Testing case# " + testCounter);
        testCounter++;
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: end");

    }

    @Nested
    @DisplayName("Tests for adding and removing figures")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Square s = new Square();
            Triangle t = new Triangle();
            Circle c = new Circle();

            //When
            shapeCollector.addFigure(s);
            shapeCollector.addFigure(t);
            shapeCollector.addFigure(c);

            //Then
            Assertions.assertEquals(3, shapeCollector.figures.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Circle circle = new Circle();
            Square square = new Square();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(1, shapeCollector.figures.size());

        }
    }

    @Nested
    @DisplayName("Test for getting and showing figures")
    class testingFigures {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Circle circle = new Circle();
            Square square = new Square();
            Triangle triangle = new Triangle();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            Shape result = shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(triangle, result);
        }

        @Test
        void showFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(new Square());
            shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Circle());

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Square" + "Triangle" + "Circle", result);

        }
    }
}

