package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book = new Book("test", "test", 1985, "test");
        Book book1 = new Book("test1", "test1", 1995, "test");
        Book book2 = new Book("test2", "test2", 2005, "test");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int yearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then

        System.out.println(yearMedian);
        assertEquals(yearMedian, 1995);
    }
}
