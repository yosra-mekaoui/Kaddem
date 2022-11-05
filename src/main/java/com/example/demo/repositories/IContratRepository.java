package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Contrat;
@Repository
public interface IContratRepository extends CrudRepository<Contrat, Integer> {
}
