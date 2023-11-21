package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.StatView;
import com.nba.nbaMatch.api.repository.MatchRepository;
import com.nba.nbaMatch.api.repository.StatViewRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.nbaMatch.api.modele.Match;
import com.nba.nbaMatch.api.modele.Joueur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatViewSvcClass implements StatViewService {

    private StatViewRepository statRepo;

    private MatchService matchService;
    private JoueurService joueurService;

    @Autowired
    public StatViewSvcClass(StatViewRepository statRepo, MatchService matchService, JoueurService joueurService) {
        this.statRepo = statRepo;
        this.joueurService = joueurService;
        this.matchService = matchService;
    }

    public List<StatView> getAllStat() {
        return statRepo.findAll();
    }
    public StatView createStat (int idMatch, int idJoueur, int passeDecisive, int ballePerdu, int interception, int contreMatch, int faute, int tir, int troisPoints, int lancerFront, int rbOffensive, int rbDefensive) {
        Match m = matchService.getMatchById(idMatch);
        Joueur j = joueurService.getJoueurById(idJoueur);
        StatView stat = new StatView(m, j, passeDecisive, ballePerdu, interception, contreMatch, faute, tir, troisPoints, lancerFront, rbOffensive, rbDefensive );
        return statRepo.save(stat);
    }
}
