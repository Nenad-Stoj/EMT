package lab2.emt.service.impl;

import lab2.emt.model.Country;
import lab2.emt.repository.CountryRepository;
import lab2.emt.service.CountryInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CountryServiceImpl implements CountryInterface {
    private final CountryRepository countryRepo;

    public CountryServiceImpl(CountryRepository countryRepo) {
        this.countryRepo = countryRepo;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepo.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        countryRepo.deleteById(id);
    }

    @Override
    public List<Country> findAll() {
        return countryRepo.findAll();
    }
}
