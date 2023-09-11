package pl.comarch.szkolenia.abstrakcja.klasy.abstrakcyjne;

public class DBAlgorytm extends Algorytm {
    @Override
    void wczytajDane() {
        System.out.println("Wczytuje dane z bazy !!!");
    }

    @Override
    void zapiszWyniki() {
        System.out.println("Zapisuje dane do bazy !!!");
    }
}
