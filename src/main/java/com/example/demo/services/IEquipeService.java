package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Equipe;

import java.util.List;
@Service
public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e) ;
    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
