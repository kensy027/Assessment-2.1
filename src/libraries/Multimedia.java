/**
* File: Multimedia.java
* Description: Class representing details of multimedia items such as CDs, DVDs, and other formats. It includes properties 
* like title, author/publisher, type, length/duration, publication year, edition, and rating. This class supports sorting 
* and searching functionalities specific to multimedia items.
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
 * Represents a multimedia item such as a CD, DVD, or other formats. This class includes detailed attributes
 * like title, author or publisher, media type, duration, publication year, edition, and rating. It also
 * implements Comparable to allow sorting multimedia items based on title and type.
 */
public class Multimedia implements Comparable<Multimedia> {
    private String title;
    private String authorPublisher;
    private String type;
    private int duration;
    private int publicationYear;
    private String edition;
    private String rating;

    /**
     * Constructor to initialize a Multimedia object with all attributes.
     *
     * @param title Title of the multimedia item.
     * @param authorPublisher Author or publisher of the item.
     * @param type Type of the multimedia (e.g., CD, DVD).
     * @param duration Duration in minutes.
     * @param publicationYear Year of publication.
     * @param edition Edition of the item.
     * @param rating Rating of the item.
     */
    public Multimedia(String title, String authorPublisher, String type, int duration, int publicationYear, String edition, String rating) {
        this.title = title;
        this.authorPublisher = authorPublisher;
        this.type = type;
        this.duration = duration;
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

    public String getAuthorPublisher() {
        return authorPublisher;
    }

    public void setAuthorPublisher(String authorPublisher) {
        this.authorPublisher = authorPublisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
     * Compares this Multimedia object with another based on title and then by type, which is useful for sorting.
     *
     * @param other Another multimedia object to compare against.
     * @return a negative integer, zero, or a positive integer as this multimedia item
     *         is less than, equal to, or greater than the specified multimedia item.
     */
    @Override
    public int compareTo(Multimedia other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return this.type.compareTo(other.type);
    }

    /**
     * Checks if this multimedia item is equal to another object by comparing titles and types.
     *
     * @param obj the object to compare with.
     * @return true if the given object represents a Multimedia equivalent to this item, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia that = (Multimedia) obj;
        return title.equals(that.title) && type.equals(that.type);
    }

    /**
     * Returns a hash code value for the multimedia item, which is derived from the title and type.
     *
     * @return a hash code value for this multimedia item.
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, type);
    }

    /**
     * Provides a string representation of the multimedia item, including all its attributes.
     *
     * @return a string representation of this multimedia item.
     */
    @Override
    public String toString() {
        return "Multimedia{" +
               "title='" + title + '\'' +
               ", authorPublisher='" + authorPublisher + '\'' +
               ", type='" + type + '\'' +
               ", duration=" + duration +
               ", publicationYear=" + publicationYear +
               ", edition='" + edition + '\'' +
               ", rating='" + rating + '\'' +
               '}';
    }
}
