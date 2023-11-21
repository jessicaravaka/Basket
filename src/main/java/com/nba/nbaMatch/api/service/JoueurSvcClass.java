package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nba.nbaMatch.api.modele.Joueur;

import java.util.List;

@Service
public class JoueurSvcClass implements  JoueurService{
    @Autowired
    private JoueurRepository joueurRepo;

    @Override
    public  Joueur create(Joueur joueur) { return joueurRepo.save(joueur);}

    @Override
    public List<Joueur> getAllJoueur() {return joueurRepo.findAll();}

}
