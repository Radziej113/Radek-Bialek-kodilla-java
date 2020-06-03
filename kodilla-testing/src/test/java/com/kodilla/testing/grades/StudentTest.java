package com.kodilla.testing.grades;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
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
    public void testCalculateAvg() {
        //Given
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(3);
        grades.add(3);
        grades.add(3);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(5);
        grades.add(5);
        grades.add(5);
        grades.add(5);
        grades.add(5);
        grades.add(5);
        Student student = new Student("Adam", grades);

        double expectedAverage = 4.1875;
        //When
        double result = student.calculateAvg();
        //Then
        assertEquals(expectedAverage, result, 0.001);
    }

    @Test
    public void testToLittleGrades() {
        //Given
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Student student = new Student("Adam", grades);
        //When
        double result = student.calculateAvg();
        //Then
        assertEquals(0.0,result,0.001);
        System.out.println("Student has too little grades.");
    }

    @Test
    public void testFewGrades() {
        //Given
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        Student student = new Student("Adam", grades);
        //When
        double result = student.calculateAvg();
        //Then
        assertEquals(4.5,result,0.001);
        System.out.println("Student has only a few grades, so average isn't fair.");
    }
}