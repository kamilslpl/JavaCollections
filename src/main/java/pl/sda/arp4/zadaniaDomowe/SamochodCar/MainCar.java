package pl.sda.arp4.zadaniaDomowe.SamochodCar;

import java.util.Optional;

public class MainCar {
    public static void main(String[] args) {


        Garaz garaz = new Garaz();

        SamochodCar samochod1 = new SamochodCar("gka");
        SamochodCar samochod2 = new SamochodCar("wle");
        SamochodCar samochod3 = new SamochodCar("ddd");
        SamochodCar samochod4 = new SamochodCar("dds");
        SamochodCar samochod5 = new SamochodCar("adw");
        SamochodCar samochod6 = new SamochodCar("wds");

            garaz.wjazdSamochodu(samochod1);

            garaz.wyjazdSamochodu("gka");

            garaz.wyjazd("wle");

        Optional<SamochodCar> tuMozeBycSamochod = garaz.wyjazd("ddd");
        if (tuMozeBycSamochod.isPresent()){
            SamochodCar samochodKtoryWyjechal = tuMozeBycSamochod.get();
            System.out.println("Wyjechal: " + samochodKtoryWyjechal.getNumerRejestracyjny());

        }else{
            System.out.println("Skradziono fure");
        }

    }
}
