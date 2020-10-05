package com.goodbooks.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.goodbooks.domain.composite.BookRatingKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRating {
    @EmbeddedId
    BookRatingKey id;
    
    @ManyToOne
    @MapsId("readerId")
    @JoinColumn(name = "reader_id")
    Reader reader;
 
    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    Book book;
 
    BigDecimal rating;
    String review;

}
