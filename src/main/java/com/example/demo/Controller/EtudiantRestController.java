package com.example.demo.Controller;

import com.example.demo.Entities.Etudiant;
import com.example.demo.Service.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantRestController {
    private final IEtudiantService iEtudiantService;
    //couplage faibles
    //Id : @RequiredArgsConstructor
//http://localhost:8080/test/etudiant/all

    @GetMapping("/all")
    @ResponseBody
    public List<Etudiant> getEtudiants(){
        return iEtudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return  iEtudiantService.addEtudiant(etudiant);
    }
    @PutMapping ("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return  iEtudiantService.addEtudiant(etudiant);
    }
    @GetMapping("/get/{id-etudiant}")

    public Etudiant getById(@PathVariable("id-etudiant") Integer id){
       return iEtudiantService.retrieveEtudiant(id);
    }
    @DeleteMapping("/remove/{id-etudiant}")
    public void removeEtudiant(@PathVariable("id-etudiant") Integer id){
        iEtudiantService.removeEtudiant(id);
    }
}
