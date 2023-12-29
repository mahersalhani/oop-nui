package dev.lpa;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    private final String name;
    private final double rating;
    private final int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", rating=" + rating + ", year=" + year + '}';
    }
}

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getRating(), m2.getRating());
    }
}

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}




























