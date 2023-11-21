package com.nba.nbaMatch.api.modele;

import jakarta.persistence.*;

@Entity
@Table (name = "joueur")
public class Joueur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int num;
    @ManyToOne
    @JoinColumn (name = "idEquipe", referencedColumnName ="id")
    private Equipe equipe;

    public Joueur(String nom, int num, Equipe equipe) {
        this.nom = nom;
        this.num = num;
        this.equipe = equipe;
    }

    public Joueur() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
