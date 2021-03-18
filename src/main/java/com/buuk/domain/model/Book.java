package com.buuk.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue
    public Long id;

    public String title;
    public String author;
    public String isbn;
    @Column(name="RELEASE_DATE")
    public int releaseDate;
    public int length;
}
