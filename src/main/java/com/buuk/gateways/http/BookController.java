package com.buuk.gateways.http;

import com.buuk.domain.model.Book;
import com.buuk.domain.model.BookDto;
import com.buuk.usecase.book.search.FindBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    private FindBook findBook;
    @Autowired
    public BookController(FindBook findBook) {
        this.findBook = findBook;
    }

    @GetMapping("/books")
    public ResponseEntity<BookDto> getBook(@RequestParam String title) {
        return ResponseEntity.ok(this.findBook.findBook(title));
    }

}
