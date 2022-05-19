package pl.sda.arp4.zadaniaDomowe.SamochodCar;

/*
wjazd pojazdu
        wyjazd pojazdu
        wypisz wszystkie pojazdy w garażu
        wypisz tablice rejestracyjne pojazdów w garażu
        wypisz tablice rejestracyjne pojazdów w garażu które zaczynają się (nie zawierają) od tego co wpiszemy (np. "GKA")
*/

public class SamochodCar {
    String numerRejestracyjny;

    public SamochodCar(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }
}
