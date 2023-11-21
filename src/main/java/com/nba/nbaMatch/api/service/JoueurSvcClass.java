package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.Equipe;
import com.nba.nbaMatch.api.modele.Joueur;
import com.nba.nbaMatch.api.repository.EquipeRepository;
import com.nba.nbaMatch.api.repository.JoueurRepository;
import com.nba.nbaMatch.api.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nba.nbaMatch.api.modele.Equipe;

import java.util.List;

@Service
public class JoueurSvcClass implements JoueurService {
    @Autowired
    private JoueurRepository joueurRepo;
    private EquipeRepository equipeRepo;
    private EquipeService equipeService;

    @Autowired
    public JoueurSvcClass(JoueurRepository joueurRepository, EquipeService equipeService) {
        this.joueurRepo = joueurRepository;
        this.equipeService = equipeService;
    }
    @Override
    public List<Joueur> getAllJoueur() {
        return joueurRepo.findAll();
    }

    public Joueur getJoueurById(int idJoueur) {
        return joueurRepo.findById(idJoueur)
                .orElseThrow(() -> new RuntimeException("Player not found with id: " + idJoueur));
    }

    @Override
    public Joueur create(String nom, int num, int idEquipe) {
        Equipe e = equipeService.getEquipeById(idEquipe);
        Joueur j = new Joueur(nom, num, e);
        return joueurRepo.save(j);
    }

}
