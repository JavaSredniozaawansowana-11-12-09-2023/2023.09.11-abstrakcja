package pl.comarch.szkolenia.abstrakcja.interfejsy;

public class Main {
    public static void main(String[] args) {
        Interfejs1 k = new Klasa3();
        k.a();
        String x = k.b(5);
        System.out.println(k.cos);
        System.out.println(Interfejs1.cos);

        System.out.println(Constants.info);

        if(k instanceof Klasa) {
            Klasa klasa = (Klasa) k;
            klasa.x = 6;
            klasa.innaMetoda();
        }
    }
}
