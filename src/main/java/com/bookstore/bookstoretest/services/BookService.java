package com.bookstore.bookstoretest.services;

import com.bookstore.bookstoretest.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BookService {
    Page<Book> findByFilters(String title, String brand, Integer year, Pageable pageable);

    Optional<Book> findById(Long id);

    Book save(Book book);

    void deleteById(Long id);

    boolean existsById(Long id);
}
