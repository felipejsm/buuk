package com.buuk.domain.repository;

import com.buuk.domain.model.Book;
import com.buuk.domain.model.BookDto;

public interface SaveBookRepository {
    public Book save(BookDto bookDto);
}
