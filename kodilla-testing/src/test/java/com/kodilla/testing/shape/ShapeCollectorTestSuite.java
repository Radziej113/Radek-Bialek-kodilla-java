package com.kodilla.testing.shape;

import org.junit.*;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test was finished");
    }

    @Test
    public void testAddFigure() {
        System.out.println("Testing adding figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();

        ArrayList<Shape> expectedList = new ArrayList<Shape>();
        Square square = new Square();
        expectedList.add(square);
        Circle circle = new Circle();
        expectedList.add(circle);
        Triangle triangle = new Triangle();
        expectedList.add(triangle);

        ShapeCollector collector = new ShapeCollector(sampleList);
        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        collector.addFigure(triangle);
        //Then
        assertEquals(3, sampleList.size());
        assertEquals(expectedList, sampleList);
        System.out.println("Sample figures were added");
    }
    @Test
    public void testAddNoFigure() {
        System.out.println("Testing adding no figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        ArrayList<Shape> expectedList = new ArrayList<Shape>();

        ShapeCollector collector = new ShapeCollector(sampleList);
        //When
        collector.addFigure(null);
        //Then
        assertEquals(0, sampleList.size());
        assertEquals(expectedList, sampleList);
        System.out.println("No figure was added");
    }
    @Test
    public void testRemoveFigure() {
        System.out.println("Testing removing figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        Square square = new Square();
        sampleList.add(square);
        Circle circle = new Circle();
        sampleList.add(circle);
        Triangle triangle = new Triangle();
        sampleList.add(triangle);

        ArrayList<Shape> expectedList = new ArrayList<Shape>();
        expectedList.add(square);
        expectedList.add(triangle);

        ShapeCollector downsizer = new ShapeCollector(sampleList);
        //When
        downsizer.removeFigure(circle);
        //Then
        assertEquals(2, sampleList.size());
        assertEquals(expectedList, sampleList);
        System.out.println("Circle was removed");
    }
    @Test
    public void testRemoveNotExistingFigure() {
        System.out.println("Testing removing not existing figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        ArrayList<Shape> expectedList = new ArrayList<Shape>();

        Square square = new Square();

        ShapeCollector downsizer = new ShapeCollector(sampleList);
        //When
        downsizer.removeFigure(square);
        //Then
        assertEquals(0, sampleList.size());
        assertEquals(expectedList, sampleList);
        System.out.println("Not existing figure wasn't removed");
    }
    @Test
    public void testGetFigure() {
        System.out.println("Testing getting figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        Square square = new Square();
        sampleList.add(square);
        Circle circle = new Circle();
        sampleList.add(circle);
        Triangle triangle = new Triangle();
        sampleList.add(triangle);

        ShapeCollector shapeGetter = new ShapeCollector(sampleList);
        //When
        Shape firstResult = shapeGetter.getFigure(0);
        Shape secondResult = shapeGetter.getFigure(1);
        Shape thirdResult = shapeGetter.getFigure(2);
        //Then
        assertEquals(square, firstResult);
        assertEquals(circle, secondResult);
        assertEquals(triangle, thirdResult);
        System.out.println("Required figures were get");
    }
    @Test
    public void testGetNotExistingFiure() {
        System.out.println("Testing getting not existing figure");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        ShapeCollector shapeGetter = new ShapeCollector(sampleList);
        //When
        Shape result = shapeGetter.getFigure(1);
        //Then
        assertEquals(null, result);
        System.out.println("Not existing figure wasn't get");
    }
    @Test
    public void testShowFigures() {
        System.out.println("Testing showing list of all figures");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        Square square = new Square();
        sampleList.add(square);
        Circle circle = new Circle();
        sampleList.add(circle);
        Triangle triangle = new Triangle();
        sampleList.add(triangle);

        ShapeCollector showList = new ShapeCollector(sampleList);
        //When
        showList.showFigures();
        //Then
        assertEquals(3, sampleList.size());
        assertEquals("square, circle, triangle",showList.showFigures());
        System.out.println("List of all figures was showed");
    }

    @Test
    public void testShowZeroListFigures() {
        System.out.println("Testing showing null list");
        //Given
        ArrayList<Shape> sampleList = new ArrayList<Shape>();
        ArrayList<Shape> expectedList = new ArrayList<Shape>();

        ShapeCollector showList = new ShapeCollector(sampleList);
        //When
        showList.showFigures();
        //Then
        assertEquals(0, sampleList.size());
        assertEquals(expectedList, sampleList);
        System.out.println("List with no figures was showed");
    }
}
