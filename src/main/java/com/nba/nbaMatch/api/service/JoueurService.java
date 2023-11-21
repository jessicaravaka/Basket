package com.nba.nbaMatch.api.service;
import com.nba.nbaMatch.api.modele.Joueur;

import java.util.List;
public interface JoueurService {
    Joueur create(Joueur joueur);
    List<Joueur> getAllJoueur();

}
