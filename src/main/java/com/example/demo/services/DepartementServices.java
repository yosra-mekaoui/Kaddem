package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.Entities.Departement;
import com.example.demo.repositories.IDepartementRepository;

@Component
public class DepartementServices {
    IDepartementRepository departementRepository ;

    Departement addDepartement(Departement departement) { return departementRepository.save(departement) ; }
}
