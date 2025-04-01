package com.scheduleapp.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
public class Praktyki {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Lab;

    private int ID_kierunku;
    private int ID_wykladowcy;
    private Date godzinaRozpoczecia;
    private Date godzinaZakonczenia;
    private String nazwaPrzedmiotu;
    private String typ;

    // Gettery i settery

    public int getID_Lab() {
        return ID_Lab;
    }

    public void setID_Lab(int ID_Lab) {
        this.ID_Lab = ID_Lab;
    }

    public int getID_kierunku() {
        return ID_kierunku;
    }

    public void setID_kierunku(int ID_kierunku) {
        this.ID_kierunku = ID_kierunku;
    }

    public int getID_wykladowcy() {
        return ID_wykladowcy;
    }

    public void setID_wykladowcy(int ID_wykladowcy) {
        this.ID_wykladowcy = ID_wykladowcy;
    }

    public Date getGodzinaRozpoczecia() {
        return godzinaRozpoczecia;
    }

    public void setGodzinaRozpoczecia(Date godzinaRozpoczecia) {
        this.godzinaRozpoczecia = godzinaRozpoczecia;
    }

    public Date getGodzinaZakonczenia() {
        return godzinaZakonczenia;
    }

    public void setGodzinaZakonczenia(Date godzinaZakonczenia) {
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
