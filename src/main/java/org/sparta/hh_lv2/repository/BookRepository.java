package org.sparta.hh_lv2.repository;

import org.sparta.hh_lv2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
