package com.goodbooks.repository;

import java.util.List;

import com.goodbooks.dto.BookRatingDTO;
import com.goodbooks.model.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingRepository extends JpaRepository<BookRating, Integer> {

    @Query("SELECT new com.goodbooks.dto.BookRatingDTO(C.title, C.subtitle, C.rating) FROM "
    + " (SELECT B.title AS title, B.subtitle as subtitle, AVG(BR.rating) as rating from BookRating BR inner join BR.book B GROUP BY B.title, B.subtitle) C"
    + " ORDER BY C.rating desc limit :max")
    public List<BookRatingDTO> findTopBooksByOverallRating(@Param("max") int max);
}
