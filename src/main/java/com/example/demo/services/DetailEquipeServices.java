package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.Entities.DetailEquipe;
import com.example.demo.repositories.IDetailEquipeRepository;

@Component
public class DetailEquipeServices {
    IDetailEquipeRepository detailEquipeRepository ;

    DetailEquipe addDetailEquipe(DetailEquipe detailEquipe) { return detailEquipeRepository.save(detailEquipe) ; }
}
