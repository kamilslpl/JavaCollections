package pl.sda.arp4.zadaniaDomowe.KoszykZakupowy;

/*

*/

import java.util.*;

public class MainKoszykZakupowy {
    public static void main(String[] args) {

        List<Produkt> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("masło", 2.30, PodatekProduktu.VAT8));
        listaProduktow.add(new Produkt("telewizor samsung", 100.1, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("komputer samsung", 111.1, PodatekProduktu.VAT5));
        listaProduktow.add(new Produkt("mercedes", 0.50, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkt("bułka", 5.00, PodatekProduktu.NO_VAT));
        listaProduktow.add(new Produkt("kamera", 110.00, PodatekProduktu.VAT5));

        System.out.println();
        System.out.println("Tylko Vat8");
        for (Produkt produkt : listaProduktow) {
            if(produkt.getPodatek() == PodatekProduktu.VAT8){
                System.out.println(produkt);
                }
        }
        System.out.println("---------------------------");

        System.out.println("Cena wieksza niz 100");
        for (Produkt produkt : listaProduktow) {
            if (produkt.getCenaProduktu() > 100){
                System.out.println(produkt);
            }

        }
        System.out.println("---------------------------");
        System.out.println("Cena brutto wieksza niz 110");
        for (Produkt produkt : listaProduktow) {
            if (produkt.cenaBrutto() > 110.0){
                System.out.println(produkt);
                System.out.println("---------------------------");

        }

/*

        System.out.println("Czy będzie faktura czy paragon?");
        String czyFaktura = scanner.next();

        if (czyFaktura.equalsIgnoreCase("faktura")) {
            System.out.println("Proszę podać numer nip:");
            String nip = scanner.next();

            Faktura faktura = new Faktura(nip, tablicaProduktow);
            System.out.println(faktura);
        } else {
            Rachunek rachunek = new Rachunek(tablicaProduktow);
            System.out.println(rachunek);

*/

        }
    }
}

