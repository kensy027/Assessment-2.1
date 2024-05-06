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

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add a multimedia item
    public void addMultimedia(Multimedia multimedia) {
        multimediaItems.add(multimedia);
    }

    // Getters for books and multimedia items
    public List<Book> getBooks() {
        return books;
    }

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

    // Search for books by title prefix
    public List<Book> searchBooksByTitle(String titlePrefix) {
        return books.stream()
                    .filter(book -> book.getTitle().startsWith(titlePrefix))
                    .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Library{" +
               "books=" + books +
               ", multimediaItems=" + multimediaItems +
               '}';
    }
}
