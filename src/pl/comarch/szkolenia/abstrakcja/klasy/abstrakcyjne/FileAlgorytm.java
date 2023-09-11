package pl.comarch.szkolenia.abstrakcja.klasy.abstrakcyjne;

public class FileAlgorytm extends Algorytm {
    @Override
    void wczytajDane() {
        System.out.println("Wczytywanie z pliku !!!");
    }

    @Override
    void zapiszWyniki() {
        System.out.println("Zapis do pliku !!!");
    }
}
