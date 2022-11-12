package com.example.demo.Service;

import com.example.demo.Entities.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);

    Departement affecterEtudiant(Integer id,Integer idDe);

    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
}
