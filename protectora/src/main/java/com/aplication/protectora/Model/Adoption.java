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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;



@Entity
@Table(name="adoption")
public class Adoption {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_adoption")
    private int idAdoption;

    @ManyToOne
    @JoinColumn(name="id_animal", nullable = false)
    private Animals animals;
    
    @ManyToOne
    @JoinColumn(name="id_adopters", nullable = false)
    private Users adopters;
    
    @ManyToOne
    @JoinColumn(name="id_employee", nullable = false)
    private Users employee;
    
    @Column(name="tax")
    private double adoptionTax;
    
    @Column(name="city")
    private String adoptionCity;
    
    @Column(name="country")
    private String adoptionCountry;
    
    @Column(name="postal_code")
    private int adoptionPostalCode;
    
    @Column(name="date_adoption")
    private LocalDateTime dateAdoption;
    
    @Column(name="conset")
    private boolean adoptionConsent;

    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }



    public Adoption() {
    }

    public Adoption(int idAdoption, Animals Animals, Users adopters, Users employee, double adoptionTax, String adoptionCity, String adoptionCountry, int adoptionPostalCode, LocalDateTime dateAdoption, boolean adoptionConsent) {
        this.idAdoption = idAdoption;
        this.animals = Animals;
        this.adopters = adopters;
        this.employee = employee;
        this.adoptionTax = adoptionTax;
        this.adoptionCity = adoptionCity;
        this.adoptionCountry = adoptionCountry;
        this.adoptionPostalCode = adoptionPostalCode;
        this.dateAdoption = dateAdoption;
        this.adoptionConsent = adoptionConsent;
    }

    public int getIdAdoption() {
        return this.idAdoption;
    }

    public void setIdAdoption(int idAdoption) {
        this.idAdoption = idAdoption;
    }

    public Animals getAnimals() {
        return this.animals;
    }

    public void setAnimals(Animals Animals) {
        this.animals = Animals;
    }

    public Users getAdopters() {
        return this.adopters;
    }

    public void setAdopters(Users adopters) {
        this.adopters = adopters;
    }

    public Users getEmployee() {
        return this.employee;
    }

    public void setEmployee(Users employee) {
        this.employee = employee;
    }

    public double getAdoptionTax() {
        return this.adoptionTax;
    }

    public void setAdoptionTax(double adoptionTax) {
        this.adoptionTax = adoptionTax;
    }

    public String getAdoptionCity() {
        return this.adoptionCity;
    }

    public void setAdoptionCity(String adoptionCity) {
        this.adoptionCity = adoptionCity;
    }

    public String getAdoptionCountry() {
        return this.adoptionCountry;
    }

    public void setAdoptionCountry(String adoptionCountry) {
        this.adoptionCountry = adoptionCountry;
    }

    public int getAdoptionPostalCode() {
        return this.adoptionPostalCode;
    }

    public void setAdoptionPostalCode(int adoptionPostalCode) {
        this.adoptionPostalCode = adoptionPostalCode;
    }

    public LocalDateTime getDateAdoption() {
        return this.dateAdoption;
    }

    public void setDateAdoption(LocalDateTime dateAdoption) {
        this.dateAdoption = dateAdoption;
    }

    public boolean isAdoptionConsent() {
        return this.adoptionConsent;
    }

    public boolean getAdoptionConsent() {
        return this.adoptionConsent;
    }

    public void setAdoptionConsent(boolean adoptionConsent) {
        this.adoptionConsent = adoptionConsent;
    }

    public Adoption idAdoption(int idAdoption) {
        setIdAdoption(idAdoption);
        return this;
    }

    public Adoption Animals(Animals Animals) {
        setAnimals(Animals);
        return this;
    }

    public Adoption adopters(Users adopters) {
        setAdopters(adopters);
        return this;
    }

    public Adoption employee(Users employee) {
        setEmployee(employee);
        return this;
    }

    public Adoption adoptionTax(double adoptionTax) {
        setAdoptionTax(adoptionTax);
        return this;
    }

    public Adoption adoptionCity(String adoptionCity) {
        setAdoptionCity(adoptionCity);
        return this;
    }

    public Adoption adoptionCountry(String adoptionCountry) {
        setAdoptionCountry(adoptionCountry);
        return this;
    }

    public Adoption adoptionPostalCode(int adoptionPostalCode) {
        setAdoptionPostalCode(adoptionPostalCode);
        return this;
    }

    public Adoption dateAdoption(LocalDateTime dateAdoption) {
        setDateAdoption(dateAdoption);
        return this;
    }

    public Adoption adoptionConsent(boolean adoptionConsent) {
        setAdoptionConsent(adoptionConsent);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " idAdoption='" + getIdAdoption() + "'" +
            ", Animals='" + getAnimals() + "'" +
            ", adopters='" + getAdopters() + "'" +
            ", employee='" + getEmployee() + "'" +
            ", adoptionTax='" + getAdoptionTax() + "'" +
            ", adoptionCity='" + getAdoptionCity() + "'" +
            ", adoptionCountry='" + getAdoptionCountry() + "'" +
            ", adoptionPostalCode='" + getAdoptionPostalCode() + "'" +
            ", dateAdoption='" + getDateAdoption() + "'" +
            ", adoptionConsent='" + isAdoptionConsent() + "'" +
            "}";
    }

}
