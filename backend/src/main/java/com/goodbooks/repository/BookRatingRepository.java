package com.goodbooks.repository;

import java.util.List;

import com.goodbooks.domain.BookRating;
import com.goodbooks.dto.BookRatingDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingRepository extends JpaRepository<BookRating, Long> {

    @Query("SELECT new com.goodbooks.dto.BookRatingDTO(B.id, B.title, B.subtitle, AVG(BR.rating)) FROM BookRating BR inner join BR.book B GROUP BY B.id, B.title, B.subtitle ORDER BY AVG(BR.rating) desc")
    public List<BookRatingDTO> findTopBooksByOverallRating(@Param("max") int max);
}
