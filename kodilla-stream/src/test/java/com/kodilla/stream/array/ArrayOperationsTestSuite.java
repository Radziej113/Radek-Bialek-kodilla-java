package com.kodilla.stream.array;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[20];
        numbers[0]=3;
        numbers[1]=3;
        numbers[2]=3;
        numbers[3]=3;
        numbers[4]=3;
        numbers[5]=4;
        numbers[6]=4;
        numbers[7]=4;
        numbers[8]=4;
        numbers[9]=4;
        numbers[10]=4;
        numbers[11]=4;
        numbers[12]=4;
        numbers[13]=5;
        numbers[14]=5;
        numbers[15]=5;
        numbers[16]=5;
        numbers[17]=6;
        numbers[18]=6;
        numbers[19]=6;

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        double expectedAverage = 4.25;
        assertEquals(expectedAverage, result, 0.001);
    }
}
