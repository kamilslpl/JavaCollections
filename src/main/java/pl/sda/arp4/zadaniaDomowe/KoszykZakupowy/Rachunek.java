package pl.sda.arp4.zadaniaDomowe.KoszykZakupowy;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Rachunek {
    protected LocalDateTime czasZakupu;
    protected Produkt[] produkty;
    protected double sumaBrutto;

    @Override
    public String toString() {
        return "Rachunek\n" +
                "Data:=" + czasZakupu + "\n"+
                "Produkty=\n" + Arrays.toString(produkty) + "\n"+
                ", sumaBrutto=" + sumaBrutto ;

    }

    public Rachunek(Produkt[] produkty) {
        this.czasZakupu = czasZakupu;
        this.produkty = produkty;

        for (int i = 0; i < produkty.length; i++) {
            sumaBrutto = sumaBrutto + produkty[i].cenaBrutto() ;

        }

    }
}