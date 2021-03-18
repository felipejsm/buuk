package com.buuk.domain.repository;

import com.buuk.domain.model.Book;

public interface FindBookRepository {
    public Book findByTitle(String title);
}
