package com.scheduleapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Wyklady {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZajec;

    @ManyToOne
    @JoinColumn(name = "ID_kierunku", referencedColumnName = "ID_kierunku")
    private Kierunki kierunek;  // Relacja do tabeli 'kierunki'

    @ManyToOne
    @JoinColumn(name = "ID_wykladowcy", referencedColumnName = "ID_wykladowcy")
    private Wykladowca wykladowca;  // Relacja do tabeli 'wykladowca'

    @Column(nullable = false)
    private String godzinaRozpoczecia;

    @Column(nullable = false)
    private String godzinaZakonczenia;

    @Column(nullable = false, length = 100)
    private String nazwaPrzedmiotu;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String typ;

    // Gettery i settery

    public int getIdZajec() {
        return idZajec;
    }

    public void setIdZajec(int idZajec) {
        this.idZajec = idZajec;
    }

    public Kierunki getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunki kierunek) {
        this.kierunek = kierunek;
    }

    public Wykladowca getWykladowca() {
        return wykladowca;
    }

    public void setWykladowca(Wykladowca wykladowca) {
        this.wykladowca = wykladowca;
    }

    public String getGodzinaRozpoczecia() {
        return godzinaRozpoczecia;
    }

    public void setGodzinaRozpoczecia(String godzinaRozpoczecia) {
        this.godzinaRozpoczecia = godzinaRozpoczecia;
    }

    public String getGodzinaZakonczenia() {
        return godzinaZakonczenia;
    }

    public void setGodzinaZakonczenia(String godzinaZakonczenia) {
        this.godzinaZakonczenia = godzinaZakonczenia;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}

