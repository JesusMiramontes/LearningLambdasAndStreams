package com.miramontes.exercises.five.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Filter
        System.out.println("\n\n***Filter***");
        List<Person> females = people.stream().filter(p -> p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        females.forEach(System.out::println);

        // Sort
        System.out.println("\n\n***Sorted***");
        // Reverse sorted first by age then by gender
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender)).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        // All match
        // Check if all the elements meet a certain condition.
        System.out.println("\n\n***All match***");
        boolean allOlderThanFive = people.stream().allMatch(p -> p.getAge() > 5);
        System.out.println("allOlderThanFive = " + allOlderThanFive);

        // Any match
        // Check if at least ONE of the elements meet a certain condition.
        System.out.println("\n\n***Any match***");
        boolean atLeastOneOlderThan100 = people.stream().anyMatch(p -> p.getAge() > 100);
        System.out.println("atLeastOneOlderThan100 = " + atLeastOneOlderThan100);

        // None match
        // Check that NO element meet a certain condition.
        System.out.println("\n\n***None match***");
        boolean noOneOlderThan130 = people.stream().noneMatch(p -> p.getAge() > 130);
        System.out.println("noOneOlderThan130 = " + noOneOlderThan130);

        // Max
        // Check that NO element meet a certain condition.
        System.out.println("\n\n***Max***");
        Optional<Person> maxAge = people.stream().max(Comparator.comparing(Person::getAge));
        maxAge.ifPresent(m -> System.out.println("maxAge = " + m));
    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
