package com.example.demo.Repository;
import com.example.demo.Entities.Etudiant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEtudiantRepo extends CrudRepository<Etudiant, Integer> {
 //List<Etudiant> findByPrenomENotNull();

}
