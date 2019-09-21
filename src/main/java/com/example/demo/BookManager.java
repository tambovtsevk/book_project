package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookManager {

    private static List<Book> bookList = new ArrayList<>();

    //заполняем лист при старте приложения
    static {
        Book book1 = new Book("Над пропастью в о ржи", "Kek", 213, "Russian", 9);
        Book book2 = new Book("Жребий", "King", 439, "США", 8);
        bookList.add(book1);
        bookList.add(book2);
    }

    List<Book> getAllBook() {
        return bookList;
    }

    void addNewBook(Book newBook) {
        bookList.add(newBook);
    }


    Book getBookByAuthor(String author) {
        for (Book book : bookList) {
            if (book.getCountry().equals(author)) {
                return book;
            }
        }
        throw new RuntimeException("Книга не найдена");
    }

    String getBookByCountry(String country) {
        String OTBET = null;
        for (Book book : bookList) {
            if (book.getCountry().equals(country)) {
                OTBET = book.getName();
            }
        }

        if (OTBET != null) {
            return OTBET;
        } else {
            return "Книга не найдена";
        }
    }
}


