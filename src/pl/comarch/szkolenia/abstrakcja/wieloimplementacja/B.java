package pl.comarch.szkolenia.abstrakcja.wieloimplementacja;

public interface B {
    default void m() {
        System.out.println("cos 2");
    }
}
