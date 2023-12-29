package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(movies);

        System.out.println("Movies after sorting by year:");
        for (Movie movie : movies)
            System.out.println(movie);

        System.out.println("\nMovies after sorting by rating:");
        movies.sort(new RatingCompare());
        for (Movie movie : movies)
            System.out.println(movie);

        System.out.println("\nMovies after sorting by name:");
        movies.sort(new NameCompare());
        for (Movie movie : movies)
            System.out.println(movie);
    }
}
