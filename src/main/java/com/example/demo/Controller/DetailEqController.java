package com.example.demo.Controller;

import com.example.demo.Entities.DetailEquipe;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Service.IDetailEquipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailEq")
@RequiredArgsConstructor
public class DetailEqController {
    @Autowired
    IDetailEquipeService iDetailEquipeService ;

//http://localhost:8080/test/etudiant/all

    @GetMapping("/all")
    @ResponseBody
    public List<DetailEquipe> getAllDE(){
        return iDetailEquipeService.getAllDE();
    }

    @PostMapping("/add")
    public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        return  iDetailEquipeService.addDetailEquipe(detailEquipe);
    }

  /*  @PutMapping ("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return  iDetailEquipeService.addEtudiant(etudiant);
    }

    @GetMapping("/get/{id-etudiant}")
    public Etudiant getById(@PathVariable("id-etudiant") Integer id){
        return iDetailEquipeService.retrieveEtudiant(id);
    }


    @DeleteMapping("/remove/{id-etudiant}")
    public void removeEtudiant(@PathVariable("id-etudiant") Integer id){
        iDetailEquipeService.removeEtudiant(id);
    }*/
}
