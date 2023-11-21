package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.nba.nbaMatch.api.modele.Match;
public class MatchSvcClass implements MatchService {
    @Autowired
    private MatchRepository matchRepo;

    @Override
    public Match create(Match m) { return matchRepo.save(m);}
}
