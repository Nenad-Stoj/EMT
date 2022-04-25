package lab2.emt.service.impl;

import jdk.jfr.Category;
import lab2.emt.model.Author;
import lab2.emt.model.Book;
import lab2.emt.repository.AuthorRepository;
import lab2.emt.repository.BookRepository;
import lab2.emt.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements BookService {


    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    public BookServiceImpl(BookRepository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Optional<Book> save(Long id, String name, Category category, Long author, Integer numCopies) {
        Book book = bookRepo.findById(id).get();
        book.setName(name);
        book.setCopies(numCopies);
        //book.setCategory(category);

        Author realAuthor = authorRepo.findById(id).orElseThrow(RuntimeException::new);
        book.setAuthor(realAuthor);

        bookRepo.save(book);
        return Optional.of(book);
    }



    @Override
    public Optional<Book> edit(Long id, String name, Category category, Long author, Integer availableCopies) {
        return BookService.super.edit(id, name, category, author, availableCopies);
    }

    @Override
    public void markAsTakenBook(Long id) {
        Book book = bookRepo.findById(id).orElseThrow(RuntimeException::new);
        book.setCopies(book.getCopies()-1);
        bookRepo.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepo.deleteById(id);
    }
}
