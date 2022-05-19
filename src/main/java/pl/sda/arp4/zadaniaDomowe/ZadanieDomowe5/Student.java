package pl.sda.arp4.zadaniaDomowe.ZadanieDomowe5;

public class Student {
  private String imie;
  private String nazwisko;
  private String nrIndeksu;
  private Plec plec;

  public Student(String imie, String nazwisko, String nrIndeksu, Plec plec) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.nrIndeksu = nrIndeksu;
    this.plec = plec;
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public String getNrIndeksu() {
    return nrIndeksu;
  }

  public void setNrIndeksu(String nrIndeksu) {
    this.nrIndeksu = nrIndeksu;
  }

  public Plec getPlec() {
    return plec;
  }

  public void setPlec(Plec plec) {
    this.plec = plec;
  }

  @Override
  public String toString() {
    return "Student{" +
            "imie='" + imie + '\'' +
            ", nazwisko='" + nazwisko + '\'' +
            ", nrIndeksu='" + nrIndeksu + '\'' +
            ", plec=" + plec +
            '}';
  }
}