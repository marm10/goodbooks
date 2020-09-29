package com.goodbooks.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reader {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(name = "reader_book_to_read", 
    joinColumns = @JoinColumn(name = "reader_id"), 
    inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> booksToRead;
}
