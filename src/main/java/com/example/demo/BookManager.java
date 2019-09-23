package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookManager {

    private static List<Book> bookList = new ArrayList<>();

    //заполняем лист при старте приложения
    static {
        Book book1 = new Book("The Catcher in the Rye", "Salinger", 213, "Russian", 9);
        Book book2 = new Book("'Salem's Lot", "King", 439, "USA", 8);
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
        String answer = null;
        for (Book book : bookList) {
            if (book.getCountry().equals(country)) {
                answer = book.getName();
            }
        }

        if (answer != null) {
            return answer;
        } else {
            return "Книга не найдена";
        }
    }
}


