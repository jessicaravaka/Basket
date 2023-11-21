package com.nba.nbaMatch.api.controller;

import com.nba.nbaMatch.api.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


}
