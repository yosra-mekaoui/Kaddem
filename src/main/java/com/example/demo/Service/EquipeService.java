package com.example.demo.Service;

import com.example.demo.Entities.Equipe;
import com.example.demo.Repository.IEquipeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EquipeService")
@RequiredArgsConstructor
public class EquipeService implements IEquipeService{
    @Autowired
    IEquipeRepo iEquipeRepo;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return (List<Equipe>)iEquipeRepo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return iEquipeRepo.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return iEquipeRepo.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return iEquipeRepo.findById(idEquipe).get();
    }
}
