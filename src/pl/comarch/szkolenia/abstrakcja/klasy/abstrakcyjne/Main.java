package pl.comarch.szkolenia.abstrakcja.klasy.abstrakcyjne;

public class Main {
    public static void main(String[] args) {
        Algorytm algorytm = new DBAlgorytm();
        algorytm.calculate();

        Algorytm algorytm1 = new FileAlgorytm();
        algorytm1.calculate();
    }
}
