package com.aplication.protectora.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="race")
public class Race {

    @Id
    @Column(name="id_Race")
    private int id;

    @Column(name="name")
    private String raceName;

    @Column(name="cross")
    private Boolean raceCross;


    public Race() {
    }

    public Race(int id, String raceName, Boolean raceCross) {
        this.id = id;
        this.raceName = raceName;
        this.raceCross = raceCross;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaceName() {
        return this.raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public Boolean isRaceCross() {
        return this.raceCross;
    }

    public Boolean getRaceCross() {
        return this.raceCross;
    }

    public void setRaceCross(Boolean raceCross) {
        this.raceCross = raceCross;
    }

    public Race id(int id) {
        setId(id);
        return this;
    }

    public Race raceName(String raceName) {
        setRaceName(raceName);
        return this;
    }

    public Race raceCross(Boolean raceCross) {
        setRaceCross(raceCross);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", raceName='" + getRaceName() + "'" +
            ", raceCross='" + isRaceCross() + "'" +
            "}";
    }
    

}