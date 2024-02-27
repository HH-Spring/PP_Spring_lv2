package org.sparta.hh_lv2.dto.book;

import lombok.Getter;
import org.sparta.hh_lv2.entity.Book;

import java.time.LocalDateTime;

@Getter
public class BookResponseDto {
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BookResponseDto(Book book) {
        this.bookId = book.getBookId();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.language = book.getLanguage();
        this.publisher = book.getPublisher();
        this.createdAt = book.getCreatedAt();
        this.modifiedAt = book.getModifiedAt();
    }
}
