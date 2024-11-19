package com.example.SpringBoot.repository;

import com.example.SpringBoot.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    // Custom query methods can be added here
}
