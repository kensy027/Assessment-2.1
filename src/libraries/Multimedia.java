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
 * Represents a multimedia item such as a CD or DVD, also implementing Comparable.
 */
public class Multimedia implements Comparable<Multimedia> {
    private String title;
    private String authorPublisher;
    private String type;
    private int duration;
    private int publicationYear;
    private String edition;
    private String rating;

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

    @Override
    public int compareTo(Multimedia other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return this.type.compareTo(other.type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia that = (Multimedia) obj;
        return title.equals(that.title) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type);
    }

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
