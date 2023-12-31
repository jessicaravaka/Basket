package com.nba.nbaMatch.api.repository;

import com.nba.nbaMatch.api.modele.Equipe;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipeRepository extends JpaRepository<Equipe, Integer>  {
}
