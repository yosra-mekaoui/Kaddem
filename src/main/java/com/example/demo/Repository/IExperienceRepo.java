package com.example.demo.Repository;

import com.example.demo.Entities.Contrat;
import com.example.demo.Entities.Experience;
import org.springframework.data.repository.CrudRepository;

public interface IExperienceRepo extends CrudRepository<Experience, Integer> {
}
