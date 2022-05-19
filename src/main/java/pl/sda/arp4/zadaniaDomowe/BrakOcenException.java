package pl.sda.arp4.zadaniaDomowe;

public class BrakOcenException extends RuntimeException {
    public BrakOcenException(){
        super ("Brak ocen do obliczenia sredniej");
    }


}
