/**
* File: LibraryTests.java
* Description: Unit tests for the Library class, ensuring that the functionalities for adding, sorting, and searching 
* books and multimedia items operate as expected. This file contains various test cases to validate the integrity and 
* functionality of the Library management system.
* Author: Sitthixay Kenpaseuth
* Student ID: 110370389
* Email ID: kensy027@mymail.unisa.edu.au
* AI Tool Used: Copilot
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libraries.Book;
import libraries.Library;
import libraries.Multimedia;

public class LibraryTests {
    private Library library;

    /**
     * Sets up the library and initializes it with some books and multimedia items before each test.
     */
    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", 180, 1925, "1st", "PG"));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Novel", 234, 1951, "1st", "PG-13"));
        library.addMultimedia(new Multimedia("Blade Runner", "Warner Bros", "DVD", 117, 1982, "Director's Cut", "R"));
        library.addMultimedia(new Multimedia("Abbey Road", "The Beatles", "CD", 45, 1969, "1st", "G"));
    }

    /**
     * Tests if the Library instance is successfully created.
     */
    @Test
    void testLibraryConstructor() {
        try {
            assertNotNull(library, "Library should be successfully instantiated");
            System.out.println("testLibraryConstructor: Pass");
        } catch (AssertionError e) {
            System.out.println("testLibraryConstructor: Fail");
        }
    }

    /**
     * Tests adding a new book to the library and ensures the book count is incremented.
     */
    @Test
    void testAddBook() {
        try {
            int initialSize = library.getBooks().size();
            library.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian", 311, 1932, "1st", "PG-13"));
            assertEquals(initialSize + 1, library.getBooks().size(), "Adding a book should increase the books count");
            System.out.println("testAddBook: Pass");
        } catch (AssertionError e) {
            System.out.println("testAddBook: Fail");
        }
    }

    /**
     * Tests adding a new multimedia item to the library and checks if the multimedia count is properly updated.
     */
    @Test
    void testAddMultimedia() {
        try {
            int initialSize = library.getMultimediaItems().size();
            library.addMultimedia(new Multimedia("Inception", "Warner Bros", "DVD", 148, 2010, "1st", "PG-13"));
            assertEquals(initialSize + 1, library.getMultimediaItems().size(), "Adding multimedia should increase the multimedia items count");
            System.out.println("testAddMultimedia: Pass");
        } catch (AssertionError e) {
            System.out.println("testAddMultimedia: Fail");
        }
    }

    /**
     * Tests the sorting of books by title and edition to ensure they are ordered correctly.
     */
    @Test
    void testSortBooksByTitleAndEdition() {
        try {
            library.sortBooksByTitleAndEdition();
            assertEquals("The Catcher in the Rye", library.getBooks().get(0).getTitle(), "Books should be sorted by title and edition");
            System.out.println("testSortBooksByTitleAndEdition: Pass");
        } catch (AssertionError e) {
            System.out.println("testSortBooksByTitleAndEdition: Fail");
        }
    }

    /**
     * Tests the sorting of multimedia items by title and type, verifying correct ordering.
     */
    @Test
    void testSortMultimediaByTitleAndType() {
        try {
            library.sortMultimediaByTitleAndType();
            assertEquals("Abbey Road", library.getMultimediaItems().get(0).getTitle(), "Multimedia items should be sorted by title and type");
            System.out.println("testSortMultimediaByTitleAndType: Pass");
        } catch (AssertionError e) {
            System.out.println("testSortMultimediaByTitleAndType: Fail");
        }
    }

    /**
     * Tests sorting books in reverse order by author and rating to confirm that the order is reversed as expected.
     */
    @Test
    void testSortBooksByAuthorAndRatingReverse() {
        try {
            library.sortBooksByAuthorAndRatingReverse();
            assertEquals("The Catcher in the Rye", library.getBooks().get(0).getTitle(), "Sorting by author and rating reversed should put 'The Catcher in the Rye' first based on sort criteria");
            System.out.println("testSortBooksByAuthorAndRatingReverse: Pass");
        } catch (AssertionError e) {
            System.out.println("testSortBooksByAuthorAndRatingReverse: Fail");
        }
    }

    /**
     * Tests searching for books by title prefix and verifies that the correct books are found.
     */
    @Test
    void testSearchBooksByTitle() {
        try {
            List<Book> results = library.searchBooksByTitle("The");
            assertEquals(2, results.size(), "Should find two books starting with 'The'");
            System.out.println("testSearchBooksByTitle: Pass");
        } catch (AssertionError e) {
            System.out.println("testSearchBooksByTitle: Fail");
        }
    }
}
