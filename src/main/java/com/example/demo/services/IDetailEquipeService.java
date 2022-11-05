package com.example.demo.services;

import com.example.demo.Entities.DetailEquipe;

public interface IDetailEquipeService {
    DetailEquipe addDetailEquipe(DetailEquipe detailEquipe) ;

    void removeDetailEquipe(Integer idDetailEquipe) ;
}
