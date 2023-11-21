package com.nba.nbaMatch.api.service;

import com.nba.nbaMatch.api.modele.Equipe;
import com.nba.nbaMatch.api.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EquipeSvcClass implements EquipeService {
    @Autowired
    private EquipeRepository equipeRepo;

    @Override
    public Equipe getEquipeById(int idEquipe) {
        return equipeRepo.findById(idEquipe)
                .orElseThrow(() -> new RuntimeException("Equipe not found with id: " + idEquipe));
    }
}
