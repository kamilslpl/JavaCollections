package pl.sda.arp4.zadaniaDomowe;

/*
* Klasa Dziennik powinna:
    - posiadać (jako pole) listę Studentów.
    - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta dodziennika
    - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerzeindexu
    - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
indexu studenta, a w wyniku zwraca konkretnego studenta.
    - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
i zwraca średnią ocen studenta.
    - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
    - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
studentów po numerach indeksów, a następnie zwraca posortowaną listę.
*/

import java.util.ArrayList;
import java.util.List;

public class Dziennik {

    private List<Student> lista = new ArrayList<>();

    public void dodajStudenta(Student student) {
        lista.add(student);

    }

    public void odejmijStudenta(Student student) {
        lista.remove(student);

    }

    public void usunStudenta(String numerIndeksu) {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeskuStudentaI = lista.get(i).getNumerIndeku();

            numerIndeskuStudentaI = sprawdzanyStudentI.getNumerIndeku();
            if (numerIndeskuStudentaI.equals(numerIndeksu)) {
                //    lista.remove(i);
                lista.remove(sprawdzanyStudentI);
                break;
            }
        }
    }

    public Student zwrocStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeskuStudentaI = lista.get(i).getNumerIndeku();

            numerIndeskuStudentaI = sprawdzanyStudentI.getNumerIndeku();
            if (numerIndeskuStudentaI.equals(numerIndeksu)) {
                return sprawdzanyStudentI;
            }
        }
        throw new BrakStudentaException(numerIndeksu);
    }

    public double podajSredniaStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeskuStudentaI = lista.get(i).getNumerIndeku();

            if (numerIndeskuStudentaI.equals(numerIndeksu)) {
                double srednia = sprawdzanyStudentI.obliczSrednia();
                return srednia;
            }
        } throw new BrakStudentaException(numerIndeksu);

    }
    public void wypisz(){
        System.out.println("Lista studentow: ");
        System.out.println(lista);
        for (Student student : lista) {

        }

    }

}

