package com.goodbooks.domain.composite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BookRatingKey
 */
@Embeddable
public class BookRatingKey implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "reader_id")
    Long readerId;

    @Column(name = "book_id")
    Long bookId;

    @Override
    public int hashCode() {
        return readerId.hashCode() * bookId.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        BookRatingKey bookRatingKeyObj = (BookRatingKey) o;
        return bookRatingKeyObj.bookId == this.bookId && bookRatingKeyObj.readerId == this.readerId;
    }

}