package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Departement;

import java.util.List;

@Service
public interface IDepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement(Departement d) ;
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Integer idDepart);

    Departement affecterEtudiant(Integer idDep, Integer idEtudiant) ;
}
