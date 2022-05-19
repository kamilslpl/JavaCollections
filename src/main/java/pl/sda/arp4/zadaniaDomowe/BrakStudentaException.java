package pl.sda.arp4.zadaniaDomowe;

public class BrakStudentaException  extends Exception{
    public BrakStudentaException(String numerIndeksu) {
        super("Nie znaleziono studenta o numerze indeksu:" + numerIndeksu);
    }
}
