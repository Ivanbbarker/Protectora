package com.aplication.protectora.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="family")
public class Family {
    
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String familyName;

    public Family() {
    }

    public Family(int id, String familyName) {
        this.id = id;
        this.familyName = familyName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Family id(int id) {
        setId(id);
        return this;
    }

    public Family familyName(String familyName) {
        setFamilyName(familyName);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", familyName='" + getFamilyName() + "'" +
            "}";
    }
}
