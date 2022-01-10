package ari.bibliotheque.book;

import ari.bibliotheque.exceptions.BookDoesNotExistException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/book")
@CrossOrigin
public class BookController {
    private NovelRepository novelRepository;
    private ComicRepository comicRepository;

    public BookController(NovelRepository novelRepository, ComicRepository comicRepository) {
        this.novelRepository = novelRepository;
        this.comicRepository = comicRepository;
    }

    @GetMapping()
    public List<Book> getAllBook(){
        List<Book> res = new ArrayList<Book>();
        for(Novel novel : novelRepository.findAll())
            res.add(novel);
        for(Comic comic : comicRepository.findAll())
            res.add(comic);
        return res;
    }

    @GetMapping(path = "{bookId}")
    public Book getBook(@PathVariable("bookId") String bookId) throws BookDoesNotExistException {
        Book res = null;
        try {
            res = novelRepository.findById(Integer.parseInt(bookId)).get();
        } catch (EntityNotFoundException e){
            res = comicRepository.findById(Integer.parseInt(bookId)).get();
        }
        return res;
    }

    @PostMapping(value = "/novel", consumes = "application/json")
    public Book addNovel(@RequestBody Novel novel){
        return novelRepository.save(novel);
    }

    @PostMapping(value = "/comic", consumes = "application/json")
    public Book addComic(@RequestBody Comic comic){
        return comicRepository.save(comic);
    }
}
