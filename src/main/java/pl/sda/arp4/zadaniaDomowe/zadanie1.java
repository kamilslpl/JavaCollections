package pl.sda.arp4.zadaniaDomowe;

/*
Stwórz listę Integerów. Wykonaj zadania:
        - dodaj do listy 5 elementów ze scannera
        - dodaj do listy 5 elementów losowych
        - wypisz elementy
        Sprawdź działanie aplikacji.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Pddaj element");
            lista.add(scanner.nextInt());

        }
        Random generator = new Random();
        for (int i = 0; i < 5; i++) {

            //int liczba = generator.nextInt(100);
            //liczba.add(liczba);

            lista.add(generator.nextInt(100));

        }
        System.out.println("elementy listy");
        System.out.println(lista);

    }


}
