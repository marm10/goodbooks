package com.goodbooks.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String subtitle;
    private String author;
    private String publishedDate;
    private String description;
    private String imageLink;

    @ManyToMany(mappedBy = "booksToRead")
    private List<Reader> readersInterested;

    @Transient
    private BigDecimal overallRating;
}
