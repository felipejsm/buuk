package com.buuk.domain.model;

import javax.persistence.Column;

public class BookDto {
    public Long id;
    public String title;
    public String author;
    public String isbn;
    public int releaseDate;
    public int length;
}
