package com.miramontes.exercises.four.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysOfCreatingStreams {
    public static void main(String[] args) {
        // Three ways of creating a stream

        // Method 1. For arrays.
        Integer[] scores =  new Integer[]{10, 41, 20, 5, 62, 100, 1};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        // Method 2. For collections.
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();

        // Method 3.
        Stream<String> lettersStream = Stream.of("a", "b", "c");
    }
}
