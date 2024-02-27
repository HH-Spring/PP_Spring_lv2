package org.sparta.hh_lv2.repository;

import org.sparta.hh_lv2.entity.Book;
import org.sparta.hh_lv2.inter.BookDetailView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByOrderByCreatedAtDesc();

//    @Query("select bookId from Book bookId join fetch bookId")
//    Book findBookWithLoanByBookId();

//    @Query("select b from Book b join Loan l on b.bookId = l.bookId where b.bookId = :bookId")
//    BookLoanInfoDto findBookWithLoanByBookId(@Param("bookId") Long bookId);

//    SELECT
//    b.*,
//    IFNULL(l.loan_status, '대출 가능') AS loan_status
//    FROM
//    books b
//    LEFT JOIN (
//            SELECT
//                    book_id,
//            IF(COUNT(*) > 0, '대출 중', '대출 가능') AS loan_status
//    FROM
//    loans l
//    WHERE
//    return_date IS NULL
//    GROUP BY
//    book_id
//    ) l ON b.book_id = l.book_id
//            WHERE
//    b.book_id = 3;

    @Query(value = "SELECT b.*, IFNULL(l.loan_status, '대출 가능') AS loan_status " +
            "FROM books b " +
            "LEFT JOIN ( " +
            "    SELECT book_id, IF(COUNT(*) > 0, '대출 중', '대출 가능') AS loan_status " +
            "    FROM loans " +
            "    WHERE return_date IS NULL " +
            "    GROUP BY book_id " +
            ") l ON b.book_id = l.book_id " +
            "WHERE b.book_id = :bookId", nativeQuery = true)
    List<BookDetailView> findByBookWithLoanByBookId(@Param("bookId") Long bookId);
    /*
    interface 를 써야하는 이유

    JPA 에서 필요한 속성을 조회하는 것은 projection 이는 엔티티 기반

    JPA 에서 DTO 형식으로 조회하려면 interface 기반이 필요함

    */
}
