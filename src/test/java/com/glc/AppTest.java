package com.glc;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
     //AC 1:Given that I visit the site, when I first start, I expect my list to be empty.


     @Test
     public void emptyList(){
        //Setup
        ReadingList readingList = new ReadingList();
        //Assert
        List<BookItem> bookList = readingList.bookList;
        assertEquals(0,bookList.size());
    }

    //AC 2:Given that I have an empty list, when I add the first book to my list then I expect `numberRead` to return 1.

    @Test 
    public void addBook(){
        //Setup
        Book book = new Book("Atomic Habits", "James Clear", 240, 2018);
        ReadingList readingList = new ReadingList();
        //execute
        readingList.addBook(book, "January 1, 2023", 5);

        //Assert
        assertEquals(1,readingList.numberRead());
    }


}
