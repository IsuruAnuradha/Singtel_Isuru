package com.test.Singtel_Isuru.serviceImpl;

import com.test.Singtel_Isuru.model.Book;
import com.test.Singtel_Isuru.repository.BookRepository;
import com.test.Singtel_Isuru.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book getById(Integer id) {
        return bookRepository.getOne(id);
    }

    public void deleteStudent(Book book) {
        bookRepository.delete(book);
    }

}