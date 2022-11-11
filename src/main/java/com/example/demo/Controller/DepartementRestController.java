package com.example.demo.Controller;

import com.example.demo.Entities.Departement;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Service.IDepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dep")
@RequiredArgsConstructor
public class DepartementRestController {
    @GetMapping("/get/{id-dep}")

    public Departement getById(@PathVariable("id-dep") Integer id){
        return iDepartementService.retrieveDepartement(id);
    }
    private final IDepartementService iDepartementService;
    @PostMapping("/add")
    public Departement addDepar(@RequestBody Departement dep){
        return  iDepartementService.addDepartement(dep);
    }
    @GetMapping("/all")
    @ResponseBody
    public List<Departement> getDepart() {
        return iDepartementService.retrieveAllDepartements();
    }
    @PutMapping("/update/{id}/{idDep}")
    public Departement addDepar(@PathVariable("id") Integer id ,@PathVariable("idDep") Integer idDep){
        return  iDepartementService.affecterEtudiant(id,idDep);
    }

}
