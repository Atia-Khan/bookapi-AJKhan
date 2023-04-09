package com.glc;

import java.util.LinkedList;
import java.util.List;

public class ReadingList {

    List<BookItem> bookList = new LinkedList<>();

    public void addBook(Book book, String dateRead, Integer rating) {
        BookItem bookItem = new BookItem(book, dateRead, rating);
        this.bookList.add(bookItem);
    }

    public int numberRead() {
        return this.bookList.size();
    }

    public void removeBook(String title) {
        int index = 0;
        for (BookItem bookItem : this.bookList) {
            if (bookItem.book.title == title) {
                index = this.bookList.indexOf(bookItem);
            }
        }
        this.bookList.remove(index);
    }

    public List<String> getBooks() {
        List<String> bookString = new LinkedList<>();
        for (BookItem bookItem : this.bookList) {
            String ratingStar = "";
            for (int i = 0; i < bookItem.rating; i++) {
                ratingStar += "*";
            }
            bookString.add(bookItem.book.title + " by " + bookItem.book.author + ", " + bookItem.book.length
                    + " pages, " + bookItem.book.year + ", " + "read on " + bookItem.dateRead + "," + ratingStar);

        }
        return bookString;
    }
}
