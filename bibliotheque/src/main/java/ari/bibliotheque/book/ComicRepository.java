package ari.bibliotheque.book;

import ari.bibliotheque.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Integer> {

}
