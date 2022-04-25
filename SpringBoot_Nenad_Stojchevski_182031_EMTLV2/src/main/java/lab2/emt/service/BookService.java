package lab2.emt.service;

import jdk.jfr.Category;
import lab2.emt.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);


    Optional<Book> save(String name, Category category, Long author, Integer availableCopies);

    default Optional<Book> edit(Long id, String name, Category category, Long author, Integer availableCopies) {
        return null;
    }

    void markAsTakenBook(Long id);

    void deleteById(Long id);

}
