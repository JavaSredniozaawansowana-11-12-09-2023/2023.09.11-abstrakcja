package pl.comarch.szkolenia.abstrakcja.interfejsy;

public interface Interfejs1 {

    final static int cos = 6;
    void a();
    String b(int a);
    void nowa();

    default void metodaDomyslna() {
        System.out.println("metodaDomyslna !!!");
    }
}
