package org.sparta.hh_lv2.controller;

import org.sparta.hh_lv2.dto.book.BookRequestDto;
import org.sparta.hh_lv2.dto.book.BookResponseDto;
import org.sparta.hh_lv2.inter.BookDetailView;
import org.sparta.hh_lv2.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* 1. 어노테이션 매핑, 컨트롤러 들고오기
* 2. bookService 생성자 주입Di
* 3. book로 api 요청 어노테이션 post매핑
* 4. book controller에서 requestBody받으며, serivece로 이동하는 로직 수행.
*
* */
@RestController
@RequestMapping("/api")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {
        return this.bookService.createBook(bookRequestDto);
    }

    @GetMapping("/books")
    public List<BookResponseDto> findBooks() {
        return this.bookService.findBooks();
    }

    @GetMapping("/book/{bookId}")
    public List<BookDetailView> findBook(@PathVariable Long bookId) {
        return this.bookService.findBook(bookId);
    }
}
