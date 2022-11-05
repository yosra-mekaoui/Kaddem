package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Universite;

import java.util.List;

@Service
public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite(Universite u) ;
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
}
