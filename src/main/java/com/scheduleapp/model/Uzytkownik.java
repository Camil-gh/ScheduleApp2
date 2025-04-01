package com.scheduleapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 25)
    private String login;

    @Column(nullable = false, length = 25)
    private String haslo;

    @Column(nullable = false, length = 25)
    private String imie;

    @Column(nullable = false, length = 25)
    private String nazwisko;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false)
    private int telefon;

    @Column(nullable = false, length = 25)
    private String miasto;

    @Column(nullable = false, length = 25)
    private String ulice;

    private Integer numerMieszkania;

    @Column(nullable = false, length = 1)
    private String rola;

    @ManyToOne
    @JoinColumn(name = "ID_kierunku", referencedColumnName = "ID_kierunku")
    private Kierunki kierunek;  // Relacja z tabelą Kierunki (opcja zależna od struktury bazy)

    private Integer grupa;

    // Gettery i settery

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public Integer getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(Integer numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public Kierunki getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunki kierunek) {
        this.kierunek = kierunek;
    }

    public Integer getGrupa() {
        return grupa;
    }

    public void setGrupa(Integer grupa) {
        this.grupa = grupa;
    }
}
