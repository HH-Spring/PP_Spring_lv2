package org.sparta.hh_lv2.service;

import org.sparta.hh_lv2.dto.book.BookRequestDto;
import org.sparta.hh_lv2.dto.book.BookResponseDto;
import org.sparta.hh_lv2.entity.Book;
import org.sparta.hh_lv2.inter.BookDetailView;
import org.sparta.hh_lv2.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        Book book = new Book(bookRequestDto);

        Book saveBook = this.bookRepository.save(book);

        return new BookResponseDto(book);
    }

    public List<BookResponseDto> findBooks() {
        return bookRepository.findAllByOrderByCreatedAtDesc().stream().map(BookResponseDto::new).toList();
    }

    public List<BookDetailView> findBook(Long bookId) {
        List<BookDetailView> book = bookRepository.findByBookWithLoanByBookId(bookId);

        return book;
    }
}
