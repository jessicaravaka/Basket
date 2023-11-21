package com.nba.nbaMatch.api.modele;

import jakarta.persistence.*;

@Entity
@Table (name = "statView")
public class StatView {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name = "idMatch", referencedColumnName = "id")
    private Match match;

    @ManyToOne
    @JoinColumn (name = "idJoueur", referencedColumnName = "id")
    private Joueur joueur;

    private int passeDecisive;
    private int ballePerdu;
    private int interception;
    private int contreMatch;
    private int faute;
    private int tir;
    private int troisPoints;
    private int lancerFront;
    private int rbOffensive;
    private int rbDefensive;

    public StatView() {}
    public StatView(Match match, Joueur joueur, int passeDecisive, int ballePerdu, int interception, int contreMatch, int faute, int tir, int troisPoints, int lancerFront, int rbOffensive, int rbDefensive) {
        this.match = match;
        this.joueur = joueur;
        this.passeDecisive = passeDecisive;
        this.ballePerdu = ballePerdu;
        this.interception = interception;
        this.contreMatch = contreMatch;
        this.faute = faute;
        this.tir = tir;
        this.troisPoints = troisPoints;
        this.lancerFront = lancerFront;
        this.rbOffensive = rbOffensive;
        this.rbDefensive = rbDefensive;
    }

    public Integer getPasseDecisive() {
        return passeDecisive;
    }

    public void setPasseDecisive(Integer passeDecisive) {
        this.passeDecisive = passeDecisive;
    }

    public Integer getBallePerdu() {
        return ballePerdu;
    }

    public void setBallePerdu(Integer ballePerdu) {
        this.ballePerdu = ballePerdu;
    }

    public Integer getInterception() {
        return interception;
    }

    public void setInterception(Integer interception) {
        this.interception = interception;
    }

    public Integer getContreMatch() {
        return contreMatch;
    }

    public void setContreMatch(Integer contreMatch) {
        this.contreMatch = contreMatch;
    }

    public Integer getFaute() {
        return faute;
    }

    public void setFaute(Integer faute) {
        this.faute = faute;
    }

    public Integer getTir() {
        return tir;
    }

    public void setTir(Integer tir) {
        this.tir = tir;
    }

    public Integer getTroisPoints() {
        return troisPoints;
    }

    public void setTroisPoints(Integer troisPoints) {
        this.troisPoints = troisPoints;
    }

    public Integer getLancerFront() {
        return lancerFront;
    }

    public void setLancerFront(Integer lancerFront) {
        this.lancerFront = lancerFront;
    }

    public Integer getRbOffensive() {
        return rbOffensive;
    }

    public void setRbOffensive(Integer rbOffensive) {
        this.rbOffensive = rbOffensive;
    }

    public Integer getRbDefensive() {
        return rbDefensive;
    }

    public void setRbDefensive(Integer rbDefensive) {
        this.rbDefensive = rbDefensive;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}
