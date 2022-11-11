package com.example.demo.Service;

import com.example.demo.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(Integer idEdut);
    List<Etudiant> retrieveAllEtudiants();
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);

}
