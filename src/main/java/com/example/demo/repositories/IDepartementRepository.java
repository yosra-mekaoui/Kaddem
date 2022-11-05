package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Departement;

@Repository
public interface IDepartementRepository extends CrudRepository<Departement, Integer> {
}
