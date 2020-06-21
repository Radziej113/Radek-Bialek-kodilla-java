package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main (String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(2, 2);

        } catch (Exception e) {

            System.out.println("It's impossible with math that we know. Error: " + e);

        } finally {

            System.out.println("I know, that you're did your best :P");
        }
    }
}
