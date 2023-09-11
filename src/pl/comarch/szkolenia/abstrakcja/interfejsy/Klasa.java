package pl.comarch.szkolenia.abstrakcja.interfejsy;

public class Klasa implements Interfejs1 {

    int x;

    public Klasa() {
    }

    @Override
    public void a() {
        System.out.println("a !!!!");
    }

    @Override
    public String b(int a) {
        System.out.println("b !!!!");
        System.out.println(a);
        return a + " !!!";
    }

    @Override
    public void nowa() {

    }

    public void nowa(int x) {

    }

    public void innaMetoda() {
        System.out.println("Inna metoda !!!");
    }
}
