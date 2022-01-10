package ari.bibliotheque.author;

import ari.bibliotheque.exceptions.AuthorDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/author")
@CrossOrigin
public class AuthorController {
    private AuthorRepository repository;

    @Autowired
    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Author> getAllAuthor(){
        return repository.findAll();
    }

    @GetMapping(path = "{authorId}")
    public Author getAuthor(@PathVariable("authorId") String authorId) throws AuthorDoesNotExistException {
        return repository.findById(Integer.parseInt(authorId)).get();
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author){
        return repository.save(author);
    }
}
