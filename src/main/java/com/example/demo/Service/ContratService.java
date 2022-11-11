package com.example.demo.Service;

import com.example.demo.Entities.Contrat;
import com.example.demo.Repository.IContratRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ContratService")
@RequiredArgsConstructor
public class ContratService implements IContratService{
   @Autowired
    private IContratRepo contratRepo;
   // ya final ya @requiredconstructor
    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>)contratRepo.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepo.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepo.deleteById(idContrat);
    }
}
