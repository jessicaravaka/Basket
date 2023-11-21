package com.nba.nbaMatch.api.controller;

import com.nba.nbaMatch.api.modele.StatView;
import com.nba.nbaMatch.api.service.StatViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/statistique")

public class StatController {
    private StatViewService statService;

    @Autowired
    public StatController(StatViewService statService) { this.statService = statService; }

    @GetMapping
    public List<StatView> getAllStat () {
        return statService.getAllStat();
    }
    @PostMapping
    public StatView createStat(@RequestParam int idMatch, @RequestParam int idJoueur, @RequestParam int passeDecisive, @RequestParam int ballePerdu, @RequestParam int interception, @RequestParam int contreMatch, @RequestParam int faute, @RequestParam int tir, @RequestParam int troisPoints, @RequestParam int lancerFront, @RequestParam int rbOffensive, @RequestParam int rbDefensive) {
        return statService.createStat(idMatch, idJoueur, passeDecisive, ballePerdu, interception, contreMatch, faute, tir, troisPoints, lancerFront, rbOffensive, rbDefensive );
    }
}
