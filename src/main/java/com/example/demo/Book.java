package com.example.demo;

import java.time.LocalDateTime;

public class Book {
    private static String name;
    private static String author;
    private static LocalDateTime creationDate = LocalDateTime.now();
    private static Integer countPage;
    private static String country;
    private static Integer rating;

    Book(String name, String author, Integer countPage, String country, Integer rating) {
        this.name = name;
        this.author = author;
        this.countPage = countPage;
        this.country = country;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
