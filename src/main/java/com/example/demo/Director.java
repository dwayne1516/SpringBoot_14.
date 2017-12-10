package com.example.demo;

import javax.persistence.*;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    private String genre;
    @OneToMany(mappedBy = "director",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    public Set<Movie> movies;

    public void addMovie(Movie movie) {
    }
    // Getters and Setters go here
}
