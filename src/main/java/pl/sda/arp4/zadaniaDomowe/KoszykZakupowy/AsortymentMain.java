package pl.sda.arp4.zadaniaDomowe.KoszykZakupowy;

public class AsortymentMain {
    public static void main(String[] args) {
Asortyment asortyment = new Asortyment();

        Produkt marchew = new Produkt( "marchew", 1.0, PodatekProduktu.VAT8);

        asortyment.dodajWarzywo(marchew);

        Produkt ser = new Produkt("ser", 3.40, PodatekProduktu.VAT23);
        asortyment.dodajNabial(ser);


        System.out.println("+++++++++++++++++++++++++++++++");
        asortyment.wypisz();

asortyment.wypiszTanszeNiz(5.0);

asortyment.szukajProduktu("ser");


    }
}
