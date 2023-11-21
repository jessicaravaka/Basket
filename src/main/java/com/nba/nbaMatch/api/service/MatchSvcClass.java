package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.repository.JoueurRepository;
import com.nba.nbaMatch.api.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.nba.nbaMatch.api.modele.Match;
import org.springframework.stereotype.Service;
import com.nba.nbaMatch.api.modele.Equipe;

import java.util.Date;

@Service
public class MatchSvcClass implements MatchService {
    @Autowired
    private MatchRepository matchRepo;
    private EquipeService equipeService;

    @Autowired
    public MatchSvcClass(MatchRepository matchRepo, EquipeService equipeService) {
        this.matchRepo = matchRepo;
        this.equipeService = equipeService;
    }
    @Override
    public Match createMatch( String lieu, String dateMatch, int idEquipe1, int idEquipe2 ) {
        Equipe firstTeam = equipeService.getEquipeById(idEquipe1);
        Equipe secondTeam = equipeService.getEquipeById(idEquipe2);
        Match m = new Match(lieu, dateMatch, firstTeam, secondTeam);
        return matchRepo.save(m);
    }

    public Match getMatchById(int idMatch) {
        return matchRepo.findById(idMatch)
                .orElseThrow(() -> new RuntimeException("Match not found with id: " + idMatch));
    }
}
