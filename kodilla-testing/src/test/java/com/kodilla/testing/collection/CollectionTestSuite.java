package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        //String testName;
        System.out.println("Zaczynamy test");
    }

    @After
    public void after() {
        //String testName;
        System.out.println("Kończymy test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Test pustej listy");
        //Given
        ArrayList<Integer> empty = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(empty);
        //Then
        assertEquals(0, result.size());
        System.out.println("Lista jest pusta");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Test zwykłej listy");
        //Given
        ArrayList<Integer> sampleList = new ArrayList<Integer>();
        sampleList.add(1);
        sampleList.add(2);
        sampleList.add(3);
        sampleList.add(4);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(sampleList);
        //Then
        assertEquals(2, result.size());
        assertEquals(expectedList, result);
        System.out.println("Nowa lista zawiera tylko parzyste liczby");
    }
}