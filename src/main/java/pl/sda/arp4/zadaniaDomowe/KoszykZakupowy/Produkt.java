package pl.sda.arp4.zadaniaDomowe.KoszykZakupowy;

public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktu; //netto
    private PodatekProduktu podatek;

    @Override
    public String toString() {
        return "Produkt" +
                "Produkt " + nazwaProduktu +
                ", cena Produktu= " + cenaProduktu +
                ", podatek " + podatek + "\n"
                ;
    }
public double cenaBrutto(){
        double cenaProduktuBrutto = cenaProduktu + cenaProduktu* podatek.getWartoscPodatku();
    return cenaProduktuBrutto;
}

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public PodatekProduktu getPodatek() {
        return podatek;
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu podatek) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatek;
    }
}
