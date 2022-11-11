package com.example.demo.Repository;


import com.example.demo.Entities.Universite;
import org.springframework.data.repository.CrudRepository;

public interface IUniversiteRepo extends CrudRepository<Universite, Integer> {
}
