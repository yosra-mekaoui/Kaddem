package com.example.demo.Service;

import com.example.demo.Entities.Departement;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Repository.IDepartementRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartementService")
@RequiredArgsConstructor
public class DepartementService implements IDepartementService{
 @Autowired
  IDepartementRepo departementRepo;
    @Autowired
 EtudiantService etudiantService;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return  (List<Departement>)departementRepo.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepo.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepo.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepo.findById(idDepart).get();
    }

    @Override
    public Departement affecterEtudiant(Integer id,Integer idDep) {
       // System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Etudiant e=etudiantService.retrieveEtudiant(id);
      //  System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa"+e);
        Departement d=retrieveDepartement(idDep);
        e.setDepartement(d);
        etudiantService.addEtudiant(e);
        return d;
    }
}
