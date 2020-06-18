package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Java, my fatherland!", (someString) -> "ABC " + someString + " ABC");
        poemBeautifier.beautify("Java, my fatherland!", (someString) -> someString.toUpperCase());
        poemBeautifier.beautify("Java, my fatherland!", (someString) -> someString.substring(2, someString.length()-2));
        poemBeautifier.beautify("Java, my fatherland!", (someString) -> someString.toLowerCase());
        //OnlyJoke
        poemBeautifier.beautify("Java, my fatherland!", (someString) -> someString.replaceFirst("Java", "HTML"));
    }
}