package com.nba.nbaMatch.api.controller;

import com.nba.nbaMatch.api.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nba.nbaMatch.api.modele.Joueur;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/joueur")
public class JoueurController {

    private final JoueurService joueurService;

    @Autowired
    public JoueurController (JoueurService joueurService)  { this.joueurService = joueurService; }

    @GetMapping
    public List<Joueur> getAllJoueur() {
        List<Joueur> res = new ArrayList<>();
        return joueurService.getAllJoueur();
    }

    @PostMapping
    public Joueur createJoueur( @RequestParam String nom, @RequestParam int num, @RequestParam int idEquipe)  {
        return joueurService.create(nom, num, idEquipe);
    }

}
