package pl.sda.arp4.zadaniaDomowe;

/*
* Student powinna:
    - posiadać listę ocen studenta (List<Double>)
    - posiadać (pole) numer indeksu studenta (String)
    - posiadać (pole) imię studenta
    - posiadać (pole) nazwisko studenta*/

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> listaOcen = new ArrayList<>();
    private String numerIndeku;
    private String imie;
    private String nazwisko;

    public Student(String numerIndeku, String imie, String nazwisko) {
        this.numerIndeku = numerIndeku;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaOcen = new ArrayList<>();
    }

    public double obliczSrednia(){
        if (listaOcen.isEmpty()){
            throw new BrakOcenException();
        }

       double suma = 0.0;
        for (int i = 0; i < listaOcen.size(); i++) {
            suma += listaOcen.get(i);
            }return (suma / listaOcen.size());

    }

    public String getNumerIndeku() {
        return numerIndeku;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeku='" + numerIndeku + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
