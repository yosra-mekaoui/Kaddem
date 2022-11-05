package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Universite;
@Repository
public interface IUniversiteRepository extends CrudRepository<Universite, Integer> {
}
