package lab2.emt.web;


import lab2.emt.dto.BookTransferObject;
import lab2.emt.model.Book;
import lab2.emt.model.Category;
import lab2.emt.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll() {

        return ResponseEntity.ok(this.bookService.findAll());
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody BookTransferObject bookTransferObject) {
        Book book = this.bookService.save(
                bookTransferObject.getName(),
                Category.valueOf(bookTransferObject.getCategory()),
                bookTransferObject.getAuthorId(),
                bookTransferObject.getCopies()).get();
        return ResponseEntity.ok(book);
    }



}
