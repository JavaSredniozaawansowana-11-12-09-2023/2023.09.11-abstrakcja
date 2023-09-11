package pl.comarch.szkolenia.abstrakcja.klasy.abstrakcyjne;

public abstract class KlasaAbstrakcyjna {
    int x;

    public KlasaAbstrakcyjna() {
    }


    public void metoda() {
        System.out.println("metoda !!");
    }

    abstract void metodaAbstrakcyjna();
}
