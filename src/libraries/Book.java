/**
* File: Book.java
* Description: Class representing details of a book. It includes properties like title, author, genre, page count,
* publication year, edition, and rating.
* Author: Sitthixay Kenpaseuth
* Student ID: 110370389
* Email ID: kensy027@mymail.unisa.edu.au
* AI Tool Used: Copilot
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
package libraries;

import java.util.Objects;

/**
 * Represents a book with various properties and implements Comparable for sorting.
 */
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String genre;
    private int pageCount;
    private int publicationYear;
    private String edition;
    private String rating;

    /**
     * Constructor to initialize a Book object with all necessary details.
     *
     * @param title Title of the book.
     * @param author Author of the book.
     * @param genre Genre of the book.
     * @param pageCount Number of pages in the book.
     * @param publicationYear Year the book was published.
     * @param edition Edition of the book.
     * @param rating Audience rating of the book (e.g., G, PG, R).
     */
    public Book(String title, String author, String genre, int pageCount, int publicationYear, String edition, String rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Compares this Book with another Book primarily based on title, and secondarily on edition,
     * for sorting purposes.
     *
     * @param other Another book to compare against.
     * @return a negative integer, zero, or a positive integer as this book is less than, equal to,
     *         or greater than the specified book.
     */
    @Override
    public int compareTo(Book other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return this.edition.compareTo(other.edition);
    }

    /**
     * Checks if this book is equal to another object by comparing titles and editions.
     *
     * @param obj the object to compare with.
     * @return true if the given object represents a Book equivalent to this book, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && edition.equals(book.edition);
    }

    /**
     * Returns a hash code value for the book, which is derived from the title and edition.
     *
     * @return a hash code value for this book.
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, edition);
    }

    /**
     * Returns a string representation of the book, which includes all fields of the book.
     *
     * @return a string representation of this book.
     */
    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", genre='" + genre + '\'' +
               ", pageCount=" + pageCount +
               ", publicationYear=" + publicationYear +
               ", edition='" + edition + '\'' +
               ", rating='" + rating + '\'' +
               '}';
    }
}