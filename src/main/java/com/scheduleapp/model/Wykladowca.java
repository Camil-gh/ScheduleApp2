package com.scheduleapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Wykladowca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_wykladowcy")
    private int idWykladowcy;

    @Column(nullable = false, length = 20)
    private String login;

    @Column(nullable = false, length = 20)
    private String haslo;

    @Column(nullable = false, length = 55)
    private String imie;

    @Column(nullable = false, length = 55)
    private String nazwisko;

    @Column(nullable = false, length = 1)
    private String plec;

    @Column(nullable = false)
    private int wiek;

    @Column(nullable = false, length = 55)
    private String email;

    @Column(nullable = false)
    private int nrTel;

    // Gettery i settery

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNrTel() {
        return nrTel;
    }

    public void setNrTel(int nrTel) {
        this.nrTel = nrTel;
    }
}
