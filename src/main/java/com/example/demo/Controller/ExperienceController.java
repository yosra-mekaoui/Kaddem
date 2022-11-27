package com.example.demo.Controller;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Entities.Experience;
import com.example.demo.Service.IEtudiantService;
import com.example.demo.Service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/Experience")
public class ExperienceController {
    @Autowired
    IExperienceService ExperienceService ;

    @PostMapping("/add")
    @ResponseBody
    public void addExperience(@RequestBody Experience ce) {
        ExperienceService.addExperience(ce) ;
    }


    @GetMapping(value = "/getAllExperience")
    @ResponseBody
    public List<Experience> getAllExperience() {
        return  ExperienceService.retrieveAllExperiences();
    }

    @PutMapping ("/update")
    public Experience updateExperience(@RequestBody Experience ce){
        return  ExperienceService.addExperience(ce);
    }

    @GetMapping("/get/{idExperience}")
    public Experience getById(@PathVariable("idExperience") Integer id){
        return ExperienceService.retrieveExperience(id);
    }


    @DeleteMapping("/remove/{idExperience}")
    public void removeEtudiant(@PathVariable("idExperience") Integer id){
        ExperienceService.removeExperience(id);
    }
    @PutMapping("/update/{id}/{idEtudiant}")
    public Experience assignEtudiantToExperience(@PathVariable("id") Integer id , @PathVariable("idEtudiant") Integer idEtudiant){
        return  ExperienceService.assignEtudiantToExperience(id,idEtudiant);
    }

}
