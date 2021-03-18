package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        //Given
        Book book = new Book("SmartKey", "BlockChain", LocalDate.now());

        Set<Book>bookSet = new HashSet<>();

        bookSet.add(new Book("ZXC", "CXZ", LocalDate.now()));
        bookSet.add(new Book("qwe", "ewq", LocalDate.now()));
        bookSet.add(new Book("poi", "iop", LocalDate.now()));
        bookSet.add(new Book("tut", "utuu", LocalDate.now()));

        Library library = new Library("Test");

        library.setBooks(bookSet);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            library.setName("Test");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            library.setName("Test1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When & Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
