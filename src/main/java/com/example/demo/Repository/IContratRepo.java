package com.example.demo.Repository;

import com.example.demo.Entities.Contrat;

import org.springframework.data.repository.CrudRepository;

public interface IContratRepo extends CrudRepository<Contrat, Integer> {
}
