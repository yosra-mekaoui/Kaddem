package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Etudiant;

import java.util.List;
@Service
public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants() ;
    Etudiant addEtudiant(Etudiant etudiant) ;

    Etudiant updateEtudiant(Etudiant e) ;
    Etudiant retrieveEtudiant(Integer idEtudiant) ;
    void removeEtudiant(Integer idEtudiant) ;
}
