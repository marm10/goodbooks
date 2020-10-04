package com.goodbooks.dto;

import java.math.BigDecimal;

import lombok.Value;

@Value
public class BookRatingDTO {
    String title, subtititle;
    BigDecimal avgRating;
}
