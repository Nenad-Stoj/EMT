package lab2.emt.service;

import lab2.emt.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findById(Long id);
    void deleteById(Long id);
    List<Author> findAll();
}
