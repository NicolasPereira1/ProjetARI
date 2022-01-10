package ari.bibliotheque.book;

import javax.persistence.Entity;

@Entity
public class Novel extends Book {

    public Novel() {}

    public Novel(int id, String title, int authorId) {
        super(id, title, authorId, "novel");
    }
}
