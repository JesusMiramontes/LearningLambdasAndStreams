package com.miramontes.exercises.three.practice;

public class Movie {
    private String name;
    private String directorFirstname;
    private String directorLastname;
    private String genre;

    public Movie(String name, String directorFirstname, String directorLastname, String genre) {
        this.name = name;
        this.directorFirstname = directorFirstname;
        this.directorLastname = directorLastname;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectorFirstname() {
        return directorFirstname;
    }

    public void setDirectorFirstname(String directorFirstname) {
        this.directorFirstname = directorFirstname;
    }

    public String getDirectorLastname() {
        return directorLastname;
    }

    public void setDirectorLastname(String directorLastname) {
        this.directorLastname = directorLastname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
