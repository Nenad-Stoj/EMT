package lab2.emt.service.impl;


import lab2.emt.model.Author;
import lab2.emt.repository.AuthorRepository;
import lab2.emt.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepo;

    public AuthorServiceImpl(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }
    @Override
    public Optional<Author> findById(Long id) {
        Author author = authorRepo.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(author);
    }

    @Override
    public void deleteById(Long id) {
        authorRepo.deleteById(id);
    }

    @Override
    public List<Author> findAll() {
            return authorRepo.findAll();
    }
}
