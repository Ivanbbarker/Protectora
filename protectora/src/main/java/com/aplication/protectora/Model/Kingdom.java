package com.aplication.protectora.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "kingdom")
public class Kingdom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kingdom")
    private int idKingdom;

    @Column(name = "name")
    private String familyName;

    @Column(name = "icon")
    private String icon;

    @OneToMany(mappedBy = "kingdom")
    private List<Race> races;

    public Kingdom() {
    }

    public Kingdom(int idKingdom, String familyName, String icon) {
        this.idKingdom = idKingdom;
        this.familyName = familyName;
        this.icon = icon;
    }

    public int getIdKingdom() {
        return this.idKingdom;
    }

    public void setIdKingdom(int idKingdom) {
        this.idKingdom = idKingdom;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<Race> getRaces() {
        return this.races;
    }

    public void setRaces(List<Race> races) {
        this.races = races;
    }

    public Kingdom idKingdom(int idKingdom) {
        setIdKingdom(idKingdom);
        return this;
    }

    public Kingdom familyName(String familyName) {
        setFamilyName(familyName);
        return this;
    }

    public Kingdom icon(String icon) {
        setIcon(icon);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " idKingdom='" + getIdKingdom() + "'" +
                ", familyName='" + getFamilyName() + "'" +
                ", icon='" + getIcon() + "'" +
                "}";
    }

}
