package ari.bibliotheque.reader;

import ari.bibliotheque.exceptions.ReaderDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reader")
@CrossOrigin
public class ReaderController {
    private ReaderRepository repository;

    @Autowired
    public ReaderController(ReaderRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Reader> getAllReader(){
        return repository.findAll();
    }

    @GetMapping(path = "{readerId}")
    public Reader getReader(@PathVariable("readerId") String readerId) throws ReaderDoesNotExistException {
        return repository.findById(Integer.parseInt(readerId)).get();
    }

    @PostMapping
    public Reader addReader(@RequestBody Reader reader){
        return repository.save(reader);
    }
}
