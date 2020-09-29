package com.goodbooks.repository;

import java.util.List;

import com.goodbooks.model.Book;
import com.goodbooks.model.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingRepository extends JpaRepository<BookRating, Integer> {

    //TODO usar @Value do lombok para pegar informações, como num dto.
    @Query("")
    public List<Book> findTopBooksByOverallRating(Integer max);
}
