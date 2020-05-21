package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> newNumbers = new ArrayList<Integer>();

        for(Integer number: numbers) {

            int mod = number % 2;

            if (mod == 0) {

                newNumbers.add(number);
            }
        }

        return newNumbers;
    }
}
