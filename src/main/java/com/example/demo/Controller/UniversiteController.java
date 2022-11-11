package com.example.demo.Controller;

import com.example.demo.Entities.Universite;
import com.example.demo.Service.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Univ")
public class UniversiteController {
    @Autowired
    IUniversiteService iUniversiteService ;



    @PostMapping(value = "/add")
    @ResponseBody
    public void  addUniversity(   @RequestBody Universite u) {
        iUniversiteService.addUniversite(u);
    }


    @GetMapping(value = "/get")
    @ResponseBody
    public List<Universite> getAllUniversites() {
        return iUniversiteService.retrieveAllUniversites();
    }


   /* @PutMapping(value = "/univtodepar/{idUniversite}/{idDepartement}")
    @ResponseBody
    public void univtodepar(@PathVariable("idUniversite") Long idUniversite ,@PathVariable("idDepartement") Long idDepartement ) {
        iUniversiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }*/
}
