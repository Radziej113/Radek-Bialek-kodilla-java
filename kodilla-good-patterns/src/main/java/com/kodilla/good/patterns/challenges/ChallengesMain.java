package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChallengesMain {

    public static void main(String[] args) {

        Map<String, List<String>> movies = MovieStore.getMovies();

        String result = movies.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}