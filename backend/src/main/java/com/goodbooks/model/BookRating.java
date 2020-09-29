package com.goodbooks.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.goodbooks.model.composite.BookRatingKey;

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
