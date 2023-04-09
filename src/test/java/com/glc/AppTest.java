package com.glc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // AC 1:Given that I visit the site, when I first start, I expect my list to be
    // empty.

    @Test
    public void emptyList() {
        // Setup
        ReadingList readingList = new ReadingList();
        // Assert
        List<BookItem> bookList = readingList.bookList;
        assertEquals(0, bookList.size());
    }

    // AC 2:Given that I have an empty list, when I add the first book to my list
    // then I expect `numberRead` to return 1.

    @Test
    public void addBook() {
        // Setup
        Book book = new Book("Atomic Habits", "James Clear", 240, 2018);
        ReadingList readingList = new ReadingList();
        // execute
        readingList.addBook(book, "January 1, 2023", 5);

        // Assert
        assertEquals(1, readingList.numberRead());
    }

    // AC 3:Given that I have an empty list, when I add additional books to the list
    // I expect the `numberRead` to return the total number of books in my list.

    @Test
    public void addBooks() {
        // Setup
        Book book = new Book("Atomic Habits", "James Clear", 240, 2018);
        Book book2 = new Book("Think and Grow Rich", "Napoleon Hill", 300, 2016);
        ReadingList readingList = new ReadingList();
        // execute
        readingList.addBook(book, "Feburary 1, 2022", 5);
        readingList.addBook(book2, "January 15, 2023", 4);

        // Assert
        assertEquals(2, readingList.numberRead());
    }

    // Ac 4:Given that I have a book in my list, when I call `removeBook("<title>")`
    // with "title" representing the title of my book that I want to delete, then
    // when I call `getBooks()` the book I deleted should no longer be there.
    @Test
    public void removeBook() {
        // Setup
        Book book = new Book("Atomic Habits", "James Clear", 240, 2018);
        Book book2 = new Book("Think and Grow Rich", "Napoleon Hill", 300, 2016);
        ReadingList readingList = new ReadingList();

        List<String> result = new LinkedList<>();
        result.add("Atomic Habits by James Clear, 240 pages, 2018, read on Feburary 1, 2022,*****");

        // Execute
        readingList.addBook(book, "Feburary 1, 2022", 5);
        readingList.addBook(book2, "January 15, 2023", 4);

        readingList.removeBook("Think and Grow Rich");

        // Assert
        assertEquals(result, readingList.getBooks());

    }

         //AC 5:Given that I have an empty list, when I add a new book I expect `getBooks()` to return a list of books that includes the book I added.

         @Test
         public void getBookAfterAddingNew(){
            //Setup
            Book book2 = new Book("Think and Grow Rich", "Napoleon Hill", 300, 2016);
            ReadingList readingList = new ReadingList();
    
            List<String> result = new LinkedList<>();
            result.add("Think and Grow Rich by Napoleon Hill, 300 pages, 2016, read on January 15, 2023,****");
    
            //Execute
            readingList.addBook(book2, "January 15, 2023", 4);
             
            //Assert
            assertEquals(result,readingList.getBooks());
        
         }

         //AC 6:Given when I call `getBooksByRating()`, I should return a list of books that all have that rating.

         @Test
     public void getBooksByRating(){
        //Setup
        Book book = new Book("Atomic Habits", "James Clear", 240, 2018);
        Book book2 = new Book("Think and Grow Rich", "Napoleon Hill", 300, 2016);
        ReadingList readingList = new ReadingList();

        List<String> result = new LinkedList<>();
        result.add("Think and Grow Rich by Napoleon Hill, 300 pages, 2016, read on January 15, 2023,****");


        //Execute
        readingList.addBook(book, "Feburary 1, 2022", 5);
        readingList.addBook(book2, "January 15, 2023", 4);
         
        //Assert
        assertEquals(result,readingList.getBooksByRating(4));
    
     }

}
