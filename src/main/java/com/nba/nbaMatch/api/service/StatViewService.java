package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.StatView;

import java.util.List;

public interface StatViewService {

    StatView createStat(int idMatch, int idJoueur, int passeDecisive, int ballePerdu, int interception, int contreMatch, int faute, int tir, int troisPoints, int lancerFront, int rbOffensive, int rbDefensive);

    List<StatView> getAllStat();
}
