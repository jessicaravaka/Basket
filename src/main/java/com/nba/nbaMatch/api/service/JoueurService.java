package com.nba.nbaMatch.api.service;
import com.nba.nbaMatch.api.modele.Joueur;
import com.nba.nbaMatch.api.modele.Equipe;

import java.util.List;
public interface JoueurService {
    Joueur create(String nom, int num, int idEquipe);
    List<Joueur> getAllJoueur();

    Joueur getJoueurById(int idJoueur);

}
