package com.nba.nbaMatch.api.controller;

import com.nba.nbaMatch.api.modele.Match;
import com.nba.nbaMatch.api.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping ( value = "/match")
public class MatchController {


    private MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    public Match createMatch(@RequestParam String lieu, @RequestParam String dateMatch, @RequestParam int idEquipe1, @RequestParam int idEquipe2) {
        return matchService.createMatch(lieu, dateMatch, idEquipe1, idEquipe2);
    }


}
