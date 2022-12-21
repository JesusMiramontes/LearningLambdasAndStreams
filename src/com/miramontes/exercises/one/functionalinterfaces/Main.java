package com.miramontes.exercises.one.functionalinterfaces;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        // Functional
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hi!");
            }
        };

        greeting2.sayHello();
    }
}
