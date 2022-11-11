package com.example.demo.Service;

import com.example.demo.Entities.Etudiant;
import com.example.demo.Repository.IEtudiantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service("EtudiantService")
@RequiredArgsConstructor
public class EtudiantService implements IEtudiantService {
    @Autowired
    IEtudiantRepo edtREpo;
    public Etudiant addEtudiant(Etudiant e) {
       return edtREpo.save(e);

    }

    @Override
    public void removeEtudiant(Integer idEdut) {
    edtREpo.deleteById(idEdut);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiants() {

        return (List<Etudiant>) edtREpo.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return edtREpo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return edtREpo.findById(idEtudiant).orElse(null);
    }

}
