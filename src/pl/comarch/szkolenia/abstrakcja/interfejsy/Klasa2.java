package pl.comarch.szkolenia.abstrakcja.interfejsy;

public class Klasa2 implements Interfejs2 {
    @Override
    public int x() {
        return 4;
    }

    @Override
    public void metoda() {
        System.out.println("metoda");
    }
}
