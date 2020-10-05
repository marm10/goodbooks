package com.goodbooks.dto;

import java.math.BigDecimal;

import lombok.Value;

@Value
public class BookRatingDTO {
    Long bookId;
    String title, subtititle;
    BigDecimal avgRating;

    public BookRatingDTO(Long bookId, String title, String subtitle, double avgRating) {
        this.bookId = bookId;
        this.title = title;
        this.subtititle = subtitle;
        this.avgRating = new BigDecimal(avgRating);
    }
}
