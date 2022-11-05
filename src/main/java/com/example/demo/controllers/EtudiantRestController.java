package com.example.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entities.Etudiant;
import com.example.demo.services.IEquipeService;
import com.example.demo.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantRestController {

    private final IEtudiantService etudiantService ;

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiant(){
       return etudiantService.retrieveAllEtudiants() ;
    }
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant E) {
        return etudiantService.addEtudiant((E)) ;
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant E) {
        return etudiantService.updateEtudiant(E) ;
    }

    @GetMapping("/get/{id-etudiant}")
    public Etudiant getEtudiant(@PathVariable("id-etudiant") Integer idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant) ;
    }

    @DeleteMapping("/remove/{id}")
    public void removeEtudiant(@PathVariable("id") Integer idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }

}
