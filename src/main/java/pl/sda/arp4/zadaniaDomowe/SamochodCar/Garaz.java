package pl.sda.arp4.zadaniaDomowe.SamochodCar;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garaz {

    private List<SamochodCar> listaSamochodow = new ArrayList<>();

    /*
        wjazd pojazdu
        wyjazd pojazdu
        wypisz wszystkie pojazdy w garażu
        wypisz tablice rejestracyjne pojazdów w garażu
        wypisz tablice rejestracyjne pojazdów w garażu które zaczynają się (nie zawierają) od tego co wpiszemy (np. "GKA")
*/

    public void wjazdSamochodu(SamochodCar samochod) {
        listaSamochodow.add(samochod);
    }

    public void wyjazdSamochodu(String numerRejestracyjny) {
        for (SamochodCar samochodCar : listaSamochodow) {
            if (samochodCar.getNumerRejestracyjny().equals(numerRejestracyjny)) {
                listaSamochodow.remove(samochodCar);
                return;
            }
        }
        System.out.println("Nie znalezlismy samochodu: " + numerRejestracyjny);
    }

    public void wypiszSamochody() {
        System.out.println("Wszystkie samochody w garazu: ");
        for (SamochodCar samochodCar : listaSamochodow) {
            System.out.println(samochodCar);
        }
    }

    public void wypiszRejestracjeSamochodow() {
        System.out.println("Tablice rejestracyjne wszystkich samochodow: ");
        for (SamochodCar samochodCar : listaSamochodow) {
            System.out.println(samochodCar.getNumerRejestracyjny());
        }

    }

    public void wypiszSamochodyZTablicaRejestracyjnaZaczynajacaSieOd(String poczatkeRejestracji) {
        for (SamochodCar samochodCar : listaSamochodow) {
            if (samochodCar.getNumerRejestracyjny().startsWith(poczatkeRejestracji)) {
                System.out.println(samochodCar);
            }
        }
    }

    public Optional<SamochodCar> wyjazd(String numerRejestracyjny) {
        for (SamochodCar samochod : listaSamochodow) {
            if (samochod.getNumerRejestracyjny().equals(numerRejestracyjny)) {
                listaSamochodow.remove(samochod);
                return Optional.of(samochod);
            }
        }
        return Optional.empty();

    }
}

