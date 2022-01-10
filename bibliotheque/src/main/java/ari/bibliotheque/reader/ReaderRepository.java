package ari.bibliotheque.reader;

import ari.bibliotheque.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Integer> {

}
