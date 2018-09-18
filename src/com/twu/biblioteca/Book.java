package com.twu.biblioteca;

class Book {
    private String bookName;
    private String authorName;
    private String publishedYear;
    private double price;

    public Book(String bookName, String authorName, String publishedYear, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", price=" + price +
                '}';
    }
}
