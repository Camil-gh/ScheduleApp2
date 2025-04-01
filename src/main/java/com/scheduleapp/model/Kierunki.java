package com.scheduleapp.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Kierunki {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_kierunku;

    private String nazwaKierunku;
    private int rok;
    private String typ;

    // Gettery i settery

    public int getID_kierunku() {
        return ID_kierunku;
    }

    public void setID_kierunku(int ID_kierunku) {
        this.ID_kierunku = ID_kierunku;
    }

    public String getNazwaKierunku() {
        return nazwaKierunku;
    }

    public void setNazwaKierunku(String nazwaKierunku) {
        this.nazwaKierunku = nazwaKierunku;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
