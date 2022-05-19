package pl.sda.arp4.zadaniaDomowe.ZadanieDomowe5;

/*
*
*  ​Stwórz klasę Student która posiada pola:
nr indeksu
imie
nazwisko
płeć (wartość enum)

W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).

a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
b. Spróbuj wypisać elementy stosując pętlę foreach
c. Wypisz tylko kobiety
d. Wypisz tylko mężczyzn
e. Wypisz tylko indeksy osób*/

import java.util.ArrayList;
import java.util.List;

public class MainZadanieDomowe5
{
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();

        Student student = new Student("Pawel", "Gawel", "123", Plec.MEZCZYZNA);
        lista.add(student);
        lista.add(new Student("Alicja", "Wkrainie", "555", Plec.KOBIETA));
        lista.add(new Student("Michal", "Nowak", "556", Plec.MEZCZYZNA));
        lista.add(new Student("Ola", "Nowak", "557", Plec.KOBIETA));

//        lista.add(new Student("Jacek", "Nicoś", "1", null));
//        for (int i = 0; i < lista.size(); i++) {
//            Student studentNaLiscie = lista.get(i);
//
//            // NullPointerException
//            if(studentNaLiscie.getPlec().equals(Plec.KOBIETA)){
//                System.out.println("Kobieta: " + studentNaLiscie);
//            }
//        }

        for (int i = 0; i < lista.size(); i++) {
            Student studentNaLiscie = lista.get(i);

            if (studentNaLiscie.getPlec() == Plec.KOBIETA) {
                System.out.println("Kobieta: " + studentNaLiscie);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPlec() == Plec.KOBIETA) {
                System.out.println("Kobieta: " + lista.get(i));
            }
        }

        System.out.println("----");
        for (Student studentNaLiscie : lista) {
            if (studentNaLiscie.getPlec() == Plec.KOBIETA) {
                System.out.println("Kobieta: " + studentNaLiscie);
            }
        }

        System.out.println("----");
        for (Student studentNaLiscie : lista) {
            if (studentNaLiscie.getPlec() == Plec.MEZCZYZNA) {
                System.out.println("Mezczyzna: " + studentNaLiscie);
            }
        }

        System.out.println("----");
        System.out.println("Indeksy osób");
        for (int i = 0; i < lista.size(); i++) {
            Student studentNaLiscie = lista.get(i);

            System.out.println(studentNaLiscie.getNrIndeksu());
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNrIndeksu());
        }

        for (Student studentNaLiscie : lista) {
            System.out.println(studentNaLiscie.getNrIndeksu());
        }
    }
}
