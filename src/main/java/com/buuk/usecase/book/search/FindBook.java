package com.buuk.usecase.book.search;

import com.buuk.domain.model.BookDto;

public interface FindBook {
    public BookDto findBook(String title);
}
