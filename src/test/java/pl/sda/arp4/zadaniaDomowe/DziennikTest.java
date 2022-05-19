package pl.sda.arp4.zadaniaDomowe;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStudenta(){
        Dziennik dziennik = new Dziennik();

        try {
           Student s = dziennik.zwrocStudenta("123");
        } catch (BrakStudentaException e) {
            System.out.println("Nie znaleziono studenta");
        }

        }
        @Test
        public void test_zwrocStudentaNull(){
        Dziennik dziennik = new Dziennik();

    }

}