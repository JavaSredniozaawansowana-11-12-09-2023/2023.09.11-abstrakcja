package pl.comarch.szkolenia.abstrakcja.wieloimplementacja;

public interface A {
    default void m() {
        System.out.println("cos");
    }
}
