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
    class TestingFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Square s = new Square(4.0);
            Triangle t = new Triangle(4.9, 4.9);
            Circle c = new Circle(4.0);

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

            Circle circle = new Circle(4.0);
            Square square = new Square(4.0);

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
    class TestingFigures2 {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Circle circle = new Circle(4.0);
            Square square = new Square(4.0);
            Triangle triangle = new Triangle(4.0, 4.0);

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

            shapeCollector.addFigure(new Square(4.0));
            shapeCollector.addFigure(new Triangle(4.0, 4.0));
            shapeCollector.addFigure(new Circle(4.0));

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Square" + "Triangle" + "Circle", result);
        }
    }

    @Nested
    @DisplayName("Test for getting name, field of figures")
    class TestingFigures3 {

        @Test
        void testingGetShapeName() {
            //Given
            Circle circle = new Circle(1);
            Square square = new Square(1);
            Triangle triangle = new Triangle(1, 4);

            //When
            String result = circle.getShapeName();
            String result2 = square.getShapeName();
            String result3 = triangle.getShapeName();

            //Then
            Assertions.assertEquals("Circle", result);
            Assertions.assertEquals("Square", result2);
            Assertions.assertEquals("Triangle", result3);
        }

        @Test
        void testingGetField() {
            //Given
            Circle circle = new Circle(2);
            Square square = new Square(2);
            Triangle triangle = new Triangle(2, 4);

            //When
            Double result = circle.getField();
            Double result2 = square.getField();
            Double result3 = triangle.getField();

            //Then
            Assertions.assertEquals(12.56, result);
            Assertions.assertEquals(4, result2);
            Assertions.assertEquals(4, result3);
        }
    }
}

