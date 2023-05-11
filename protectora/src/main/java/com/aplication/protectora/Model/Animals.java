package com.aplication.protectora.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Entity
@Table(name="animals")
public class Animals {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String idAnimales;
    

    @ManyToOne
    @JoinColumn(name="id_kingdom" , nullable = false)
    private Kingdom kingdom;
    
    @ManyToOne
    @JoinColumn(name="id_race" , nullable = false)
    private Race race;
    
    @Column(name="name")
    private String animalName;
    
    @Column(name="height")
    private double animalHeight;
    
    @Column(name="weight")
    private double animalWeight;
    
    @Column(name="phatology")
    private String animalPathology;
    
    @Column(name="date_of_entry")
    private LocalDateTime animalDateOfEntry;
    
    @Column(name="departure_date")
    private LocalDateTime animalDepartureDate;


    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
                            
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }

    public Animals() {
    }

    public Animals(String idAnimales, Kingdom kingdom, Race race, String animalName, double animalHeight, double animalWeight, String animalPathology, LocalDateTime animalDateOfEntry, LocalDateTime animalDepartureDate) {
        this.idAnimales = idAnimales;
        this.kingdom = kingdom;
        this.race = race;
        this.animalName = animalName;
        this.animalHeight = animalHeight;
        this.animalWeight = animalWeight;
        this.animalPathology = animalPathology;
        this.animalDateOfEntry = animalDateOfEntry;
        this.animalDepartureDate = animalDepartureDate;
    }

    public String getIdAnimales() {
        return this.idAnimales;
    }

    public void setIdAnimales(String idAnimales) {
        this.idAnimales = idAnimales;
    }

    public Kingdom getidKingdom() {
        return this.kingdom;
    }

    public void setidKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }

    public Race getIdRace() {
        return this.race;
    }

    public void setIdRace(Race race) {
        this.race = race;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAnimalHeight() {
        return this.animalHeight;
    }

    public void setAnimalHeight(double animalHeight) {
        this.animalHeight = animalHeight;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public String getAnimalPathology() {
        return this.animalPathology;
    }

    public void setAnimalPathology(String animalPathology) {
        this.animalPathology = animalPathology;
    }

    public LocalDateTime getAnimalDateOfEntry() {
        return this.animalDateOfEntry;
    }

    public void setAnimalDateOfEntry(LocalDateTime animalDateOfEntry) {
        this.animalDateOfEntry = animalDateOfEntry;
    }

    public LocalDateTime getAnimalDepartureDate() {
        return this.animalDepartureDate;
    }

    public void setAnimalDepartureDate(LocalDateTime animalDepartureDate) {
        this.animalDepartureDate = animalDepartureDate;
    }

    public Animals idAnimales(String idAnimales) {
        setIdAnimales(idAnimales);
        return this;
    }

    public Animals kingdom(Kingdom kingdom) {
        setidKingdom(kingdom);
        return this;
    }

    public Animals idRace(Race race) {
        setIdRace(race);
        return this;
    }

    public Animals animalName(String animalName) {
        setAnimalName(animalName);
        return this;
    }

    public Animals animalHeight(double animalHeight) {
        setAnimalHeight(animalHeight);
        return this;
    }

    public Animals animalWeight(double animalWeight) {
        setAnimalWeight(animalWeight);
        return this;
    }

    public Animals animalPathology(String animalPathology) {
        setAnimalPathology(animalPathology);
        return this;
    }

    public Animals animalDateOfEntry(LocalDateTime animalDateOfEntry) {
        setAnimalDateOfEntry(animalDateOfEntry);
        return this;
    }

    public Animals animalDepartureDate(LocalDateTime animalDepartureDate) {
        setAnimalDepartureDate(animalDepartureDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " Id Animales='" + getIdAnimales() + "'" +
            ", Id Family='" + getidKingdom() + "'" +
            ", Id Race='" + getIdRace() + "'" +
            ", Animal Name='" + getAnimalName() + "'" +
            ", Animal Height='" + getAnimalHeight() + "'" +
            ", Animal Weight='" + getAnimalWeight() + "'" +
            ", Animal Pathology='" + getAnimalPathology() + "'" +
            ", Animal Date Of Entry='" + getAnimalDateOfEntry() + "'" +
            ", Animal Departure Date='" + getAnimalDepartureDate() + "'" +
            "}";
    }
    
}
