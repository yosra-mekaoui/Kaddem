package com.example.demo.Service;

import com.example.demo.Entities.Etudiant;
import com.example.demo.Entities.Experience;

import java.util.List;

public interface IExperienceService {
    // ya final ya @requiredconstructor
    List<Experience> retrieveAllExperiences();

    Experience updateExperience(Experience ce);

    Experience addExperience(Experience ce);

    Experience retrieveExperience(Integer idExperience);

    void removeExperience(Integer idExperience);

    Experience assignEtudiantToExperience(Integer id, Integer idExpereince);

    /*  @Override
          public Experience assignEtudiantToExperience(Integer idExperience, Integer idDep) {
              Experience e=ExperienceRepo.findById(idExperience);

              e.getEtudiant().add(ce);
              ce.setExperience(e);
              edtREpo.save(ce);
              ExperienceRepo.save(e);
              return ce;
          }*/

}
