package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        List<Book> bookList = getBooks();
        displayBooks(bookList);
    }

    private static List<Book> getBooks() {
        Book book1 = new Book("重构", "martin Fowler", "2003-8-1", 68.00);
        Book book2 = new Book("clean code", "Robert C·Martin", "2010-1-1", 59.00);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }

    private static void displayBooks(List<Book> bookList) {
        System.out.println("\t\tWelcome to Biblioteca!\n");
        bookList.forEach(book -> {
            System.out.println(book.toString());
        });
    }
}
