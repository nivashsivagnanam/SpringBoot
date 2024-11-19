package com.example.SpringBoot.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")  // For MongoDB (or use @Entity for JPA)
public class Book {

    private String id;        // MongoDB id (or Long id for JPA)
    private String title;
    private String author;
    private String genre;
    private String description;

    // Constructors
    public Book() {}

    public Book(String title, String author, String genre, String description) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
