package com.gegabox.ae.repositories;

import com.gegabox.ae.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
