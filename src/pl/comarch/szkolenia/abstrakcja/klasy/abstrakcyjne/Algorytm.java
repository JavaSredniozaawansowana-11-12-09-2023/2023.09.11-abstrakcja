package pl.comarch.szkolenia.abstrakcja.klasy.abstrakcyjne;

public abstract class Algorytm {

    int x;
    int y;
    public void calculate() {
        wczytajDane();
        pierwszyKrokLiczenia();
        drugiKrokLiczenia();
        trzeciKrokLiczenia();
        zapiszWyniki();
    }

    abstract void wczytajDane();

    private void pierwszyKrokLiczenia() {
        System.out.println("liczenie 1 !!");
        x = 10;
        y = 15;
    }

    private void drugiKrokLiczenia() {
        System.out.println("liczenie 2 !!");
        x = x * y;
        y = x - y;
    }

    private void trzeciKrokLiczenia() {
        System.out.println("liczenie 3 !!");
        x = y * 10;
        y = x * 5;
    }

    abstract void zapiszWyniki();
}
