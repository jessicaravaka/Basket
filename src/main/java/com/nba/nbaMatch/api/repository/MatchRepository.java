package com.nba.nbaMatch.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.nbaMatch.api.modele.Match;
public interface MatchRepository extends JpaRepository<Match, Integer> {
}
