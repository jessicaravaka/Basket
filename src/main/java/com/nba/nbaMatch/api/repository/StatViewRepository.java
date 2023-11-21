package com.nba.nbaMatch.api.repository;

import com.nba.nbaMatch.api.modele.StatView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatViewRepository extends JpaRepository <StatView, Integer> {
}
