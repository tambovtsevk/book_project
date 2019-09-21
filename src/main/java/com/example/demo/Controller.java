package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BookManager bookManager;

    //получить все книги
    @GetMapping("getAllBook")
    public List<Book> getAllBook() {
        return bookManager.getAllBook();
    }

    //получить книгу по автору
    @GetMapping("findBookByAuthor/author/{author}")
    public Book findBookByAuthor(@PathVariable String author) {
        return bookManager.getBookByAuthor(author);
    }

    //получить книгу по стране
    @GetMapping("findbookByCountry/country/{country}")
    public String findBookByCountry(@PathVariable String country) {
        return bookManager.getBookByCountry(country);
    }

    //добавить новую книгу
    @PostMapping("addNewBook")
    public String getAddBookPlusNewBook(@RequestBody Book book) {
        bookManager.addNewBook(book);
        return "Книга успешно добавлена";
    }


}
