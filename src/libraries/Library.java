/**
* File: Library.java
* Description: Class responsible for managing a collection of books and multimedia items. It supports operations such as 
* adding, sorting, and searching within the library's inventory. The class provides methods to sort books and multimedia 
* by various attributes and to search for books by title.
* Author: Sitthixay Kenpaseuth
* Student ID: 110370389
* Email ID: kensy027@mymail.unisa.edu.au
* AI Tool Used: Copilot
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
package libraries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Multimedia> multimediaItems;

    public Library() {
        books = new ArrayList<>();
        multimediaItems = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     * @param book The book to be added to the library.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds a multimedia item to the library.
     * @param multimedia The multimedia item to be added to the library.
     */
    public void addMultimedia(Multimedia multimedia) {
        multimediaItems.add(multimedia);
    }

    /**
     * Returns the list of all books in the library.
     * @return A list of books.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Returns the list of all multimedia items in the library.
     * @return A list of multimedia items.
     */
    public List<Multimedia> getMultimediaItems() {
        return multimediaItems;
    }

    // Sort books by title and edition
    public void sortBooksByTitleAndEdition() {
        Collections.sort(books, Comparator.comparing(Book::getTitle)
                                           .thenComparing(Book::getEdition));
    }

    // Sort multimedia by title and type
    public void sortMultimediaByTitleAndType() {
        Collections.sort(multimediaItems, Comparator.comparing(Multimedia::getTitle)
                                                    .thenComparing(Multimedia::getType));
    }

    // Sort books by author and rating in reverse order
    public void sortBooksByAuthorAndRatingReverse() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor)
                                           .thenComparing(Book::getRating)
                                           .reversed());
    }

    // Sort multimedia by author/publisher and rating in reverse order
    public void sortMultimediaByAuthorPublisherAndRatingReverse() {
        Collections.sort(multimediaItems, Comparator.comparing(Multimedia::getAuthorPublisher)
                                                    .thenComparing(Multimedia::getRating).reversed());
    }

    /**
     * Searches for books in the library whose titles start with a specified prefix.
     * @param titlePrefix The prefix to search for in book titles.
     * @return A list of books whose titles start with the specified prefix.
     */
    public List<Book> searchBooksByTitle(String titlePrefix) {
        return books.stream()
                    .filter(book -> book.getTitle().startsWith(titlePrefix))
                    .collect(Collectors.toList());
    }

    /**
     * Returns a string representation of the library, including lists of books and multimedia items.
     * @return A string representation of the library.
     */
    @Override
    public String toString() {
        return "Library{" +
               "books=" + books +
               ", multimediaItems=" + multimediaItems +
               '}';
    }
}
