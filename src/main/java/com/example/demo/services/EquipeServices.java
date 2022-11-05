package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.Entities.Equipe;
import com.example.demo.repositories.IEquipeRepository;

@Component
public class EquipeServices {
    IEquipeRepository equipeRepository ;

    Equipe addEquipe(Equipe equipe) { return equipeRepository.save(equipe) ; }
}
