package com.nba.nbaMatch.api.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table (name = "match")
public class Match {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    private String lieu;
    private String dateMatch;
    @ManyToOne
    @JoinColumn( name = "idEquipe1", referencedColumnName = "id")
    private Equipe equipe1;

    @ManyToOne
    @JoinColumn ( name = "idEquipe2", referencedColumnName = "id")
    private Equipe equipe2;

    public Match(String lieu, String dateMatch, Equipe equipe1, Equipe equipe2) {
        this.lieu = lieu;
        this.dateMatch = dateMatch;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Match() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(String dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }
}
