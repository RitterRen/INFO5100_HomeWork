package com.question4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    public List<Movie> genre;

    public Genre() {
        this.genre = new ArrayList<>();
    }

    public boolean addMovie(Movie movie) {
        genre.add(movie);
        return true;
    }
}
