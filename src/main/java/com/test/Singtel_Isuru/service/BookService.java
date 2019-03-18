package com.test.Singtel_Isuru.service;

import com.test.Singtel_Isuru.model.Book;

public interface BookService {

    Book save(Book book);

    Book getById(Integer id);

    void deleteStudent(Book book);
}