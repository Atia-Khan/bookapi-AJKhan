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

}

