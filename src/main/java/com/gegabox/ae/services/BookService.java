package com.gegabox.ae.services;

import com.gegabox.ae.models.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void deleteById(Long id);
}
