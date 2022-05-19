package pl.sda.arp4.zadaniaDomowe.KoszykZakupowy;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.List;

public class Asortyment {
    private List<Produkt> warzywa = new ArrayList<>();
    private List<Produkt> nabiał = new ArrayList<>();

    public void dodajWarzywo(Produkt produkt) {
        warzywa.add(produkt);
    }

    public void dodajNabial(Produkt produkt) {
        nabiał.add(produkt);
    }

    public void wypisz() {
        for (Produkt warzywo : warzywa) {
            System.out.println(warzywo);
        }
        for (Produkt produkt : nabiał) {
            System.out.println(produkt);
        }
    }

    public void wypiszTanszeNiz(double cena) {
        System.out.println("Produkty o cenie nizszej niz " + cena + " :");
        for (Produkt produkt : warzywa) {
            if (produkt.cenaBrutto() < cena) {
                System.out.println(produkt);
            }
        }
        for (Produkt produkt : nabiał) {
            if (produkt.cenaBrutto() < cena) {
                System.out.println(produkt);
            }
        }
    }

    public void szukajProduktu(String nazwa) {
        System.out.println("Produkty ktore w nazwie zawieraja " + nazwa);
        for (Produkt nabial : nabiał) {
            if (nabial.getNazwaProduktu().contains(nazwa)) {
                System.out.println(nabial);
            }
            for (Produkt warzywo : warzywa) {
                if (warzywo.getNazwaProduktu().contains(nazwa)) {
                    System.out.println(warzywo);
                }
            }
        }
    }
    public void wypiszProduktyOpodatkowane(PodatekProduktu podatek) {
        for (Produkt warzywo : warzywa) {
            if (warzywo.getPodatek() == podatek) {
                System.out.println(warzywo);
            }
            for (Produkt nabial : nabiał) {
                if (nabial.getPodatek() == podatek) {
                    System.out.println(nabial);
                }
            }
        }
    }
}
