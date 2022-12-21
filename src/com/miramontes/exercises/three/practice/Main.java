package com.miramontes.exercises.three.practice;

public class Main {
    public static void main(String[] args) {
        MoviesUtil moviesUtil = new MoviesUtil();
        String directorFullname = moviesUtil.directorFullname(new Movie("Avatar", "James", "Cameron", "Science-fiction"));
        System.out.println("directorFullname = " + directorFullname);
    }
}
