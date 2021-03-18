package com.buuk.usecase.book.search;

import com.buuk.domain.model.Book;
import com.buuk.domain.model.BookDto;
import com.buuk.domain.repository.FindBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindBookImpl implements FindBook {
    private FindBookRepository repository;
    @Autowired
    public FindBookImpl(FindBookRepository repository) {
        this.repository = repository;
    }
    @Override
    public BookDto findBook(String title) {
        Book myBook = this.repository.findByTitle(title);
        BookDto bookDto = new BookDto();
        bookDto.title = title;
        bookDto.releaseDate = myBook.releaseDate;
        bookDto.author = myBook.author;
        bookDto.id = myBook.id;
        bookDto.isbn = myBook.isbn;
        bookDto.length = myBook.length;
        return bookDto;
    }
}
