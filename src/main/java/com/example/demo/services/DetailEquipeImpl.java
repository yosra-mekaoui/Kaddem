package com.example.demo.services;

import com.example.demo.Entities.DetailEquipe;
import com.example.demo.repositories.IDetailEquipeRepository;

public class DetailEquipeImpl implements IDetailEquipeService{
    IDetailEquipeRepository detailEquipeRepository ;
    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public void removeDetailEquipe(Integer idDetailEquipe) {
        detailEquipeRepository.deleteById(idDetailEquipe);
    }
}
