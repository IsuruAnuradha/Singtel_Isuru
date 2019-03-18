package com.test.Singtel_Isuru.repository;


import com.test.Singtel_Isuru.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}