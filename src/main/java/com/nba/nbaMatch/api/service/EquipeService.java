package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.Equipe;

import java.util.Optional;

public interface EquipeService {
    Equipe getEquipeById(int idEquipe);

}
