package com.miramontes.exercises.three.practice;

import java.util.function.Function;

public class MoviesUtil {
    public String directorFullname(Movie movie){
        Function<Movie, String> directorFullname = (Movie m) -> m.getDirectorFirstname() + " " + m.getDirectorLastname();
        return directorFullname.apply(movie);
    }
}
