package com.example.demo.Service;

import com.example.demo.Entities.Contrat;
import com.example.demo.Entities.Specialite;
import com.example.demo.Repository.IContratRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public Contrat updateContrat(Contrat ce) {return contratRepo.save(ce);}

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

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        List<Contrat> listContrat=contratRepo.contratBetween2dates(startDate,endDate);
        System.out.println(listContrat);
        float chiffre=0;
        for( Contrat c:listContrat){
            if(c.getSpecialite().equals(Specialite.IA)){
                chiffre=chiffre+300;
            }
            else if (c.getSpecialite().equals(Specialite.RESEAUX)){
                chiffre=chiffre+350;
            }
            else if(c.getSpecialite().equals(Specialite.CLOUD)){
                chiffre=chiffre+400;
            }
            else if (c.getSpecialite().equals(Specialite.SECURITY)){
                chiffre=chiffre+450;
            }
        }
        return chiffre;
    }
    @Override
    public List<Contrat> contratBetween2dates(Date startDate, Date endDate) {
        return  contratRepo.contratBetween2dates(startDate,endDate);
    }
    @Override
    public Integer nbContratsValides(Date endDate, Date startDate) {
        return contratRepo.countContratByDateDebutContratAfterAndDateFinContratBefore(endDate,startDate);
    }
}
