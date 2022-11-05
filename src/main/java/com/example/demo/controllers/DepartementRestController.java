package com.example.demo.controllers;

import com.example.demo.Entities.Etudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entities.Departement;
import com.example.demo.services.IDepartementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dep")
public class DepartementRestController {
    private final IDepartementService departementService ;
    @GetMapping("/all")
    public List<Departement> getAllDepartement(){
        return departementService.retrieveAllDepartements() ;
    }

    @PostMapping("/add")
    public Departement addDepartement(@RequestBody Departement dep) {
        return departementService.addDepartement(dep) ;
    }

    @PutMapping("/update/{idDep}/{idEtud}")
    public Departement affecterDepartement(@PathVariable("idDep") Integer idDep, @PathVariable("idEtud") Integer idEtudiant) {
        return departementService.affecterEtudiant(idDep, idEtudiant) ;
    }
}
