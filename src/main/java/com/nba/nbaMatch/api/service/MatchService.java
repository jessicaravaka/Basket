package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.Match;

import java.sql.Struct;
import java.util.Date;

public interface MatchService {

    Match createMatch(String lieu, String date, int idEquipe1, int idEquipe2);

    Match getMatchById(int idMatch);

}
