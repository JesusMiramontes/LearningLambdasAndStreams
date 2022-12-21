package com.miramontes.exercises.one.functionalinterfaces;

public class HelloGreeting implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Hello.");
    }
}
