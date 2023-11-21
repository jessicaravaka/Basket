package com.nba.nbaMatch.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.nbaMatch.api.modele.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {
}
