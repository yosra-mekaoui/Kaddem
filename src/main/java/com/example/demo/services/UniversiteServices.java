package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.Entities.Universite;
import com.example.demo.repositories.IUniversiteRepository;

@Component
public class UniversiteServices {
    IUniversiteRepository universiteRepository ;

    Universite addUniversite(Universite universite) { return universiteRepository.save(universite) ; }
}
