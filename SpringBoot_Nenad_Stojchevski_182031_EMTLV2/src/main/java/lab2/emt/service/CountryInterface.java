package lab2.emt.service;

import lab2.emt.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryInterface {


    Optional<Country> findById(Long id);
    void deleteById(Long id);
    List<Country> findAll();

}
