package com.bookstore.bookstoretest.repository;

import com.bookstore.bookstoretest.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findAll(Specification<Book> spec, Pageable pageable);

/*    @Query("SELECT b FROM Book b WHERE " +
            "(:title IS NULL OR b.title LIKE CONCAT('%', :title, '%')) AND " +
            "(:brand IS NULL OR b.brand LIKE CONCAT('%', :brand, '%')) AND " +
            "(:year IS NULL OR b.year = :year)")
    Page<Book> findByFilters(@Param("title") String title,
                             @Param("brand") String brand,
                             @Param("year") Integer year,
                             Pageable pageable);*/
}
