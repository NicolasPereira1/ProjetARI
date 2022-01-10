package ari.bibliotheque.book;

import javax.persistence.Entity;

@Entity
public class Comic extends Book {
    private String series;

    public Comic() {}

    public Comic(int id, String title, int authorId, String series) {
        super(id, title, authorId, "comic");
        this.series = series;
    }

    public String getSerie() {
        return series;
    }

    public void setSerie(String series) {
        this.series = series;
    }
}
