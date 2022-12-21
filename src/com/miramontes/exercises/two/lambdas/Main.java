package com.miramontes.exercises.two.lambdas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Lambda expression with params and return.
        Calculator calculator = (int a, int b) -> {
            Random random = new Random();
            int randNumb = random.nextInt(50);
            return a * b + randNumb;
        };

        System.out.println("calculator.calculate(1,2) = " + calculator.calculate(1,2));
    }
}
