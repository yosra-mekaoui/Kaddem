package com.example.demo.Controller;
import com.example.demo.Entities.Contrat;
import com.example.demo.Service.IContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratController {
    @Autowired
    IContratService contratService ;
    @PostMapping("/add")
    @ResponseBody
    public void addContrat(@RequestBody Contrat ce) {
        contratService.addContrat(ce) ;
    }


    @GetMapping(value = "/getAllContrat")
    @ResponseBody
    public List<Contrat> getAllContrat() {
        return  contratService.retrieveAllContrats();
    }




}
