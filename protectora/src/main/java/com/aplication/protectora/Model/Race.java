package com.aplication.protectora.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_race")
    private int idRace;

    @ManyToOne
    @JoinColumn(name = "id_kingdom", nullable = false)
    private Kingdom kingdom;

    @Column(name = "name")
    private String raceName;

    public Race() {
    }

    public Race(int idRace, String raceName) {
        this.idRace = idRace;
        this.raceName = raceName;
    }

    public int getId() {
        return this.idRace;
    }

    public void setId(int idRace) {
        this.idRace = idRace;
    }

    public String getRaceName() {
        return this.raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getIdRace() {
        return this.idRace;
    }

    public void setIdRace(int idRace) {
        this.idRace = idRace;
    }

    public Kingdom getKingdom() {
        return this.kingdom;
    }

    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }

    public Race id(int idRace) {
        setId(idRace);
        return this;
    }

    public Race raceName(String raceName) {
        setRaceName(raceName);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " ID Race='" + getId() + "'" +
                ", Race Name='" + getRaceName() + "'" +
                "}";
    }

}