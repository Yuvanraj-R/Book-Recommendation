package com.bookmind.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String mood;
    private String language;
    private int estimatedMinutes;
    private double rating;
    private String description;
    private String imagePath;

    public Book() {
    }

    public Book(String title, String author, String genre, String mood, String language, int estimatedMinutes, double rating, String description, String imagePath) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.mood = mood;
        this.language = language;
        this.estimatedMinutes = estimatedMinutes;
        this.rating = rating;
        this.description = description;
        this.imagePath = imagePath;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getMood() {
        return mood;
    }

    public String getLanguage() {
        return language;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
