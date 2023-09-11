package pl.comarch.szkolenia.abstrakcja.interfejsy;

public interface InterfejsZMetodamiPrywatnymi {

    default void metoda() {
        String x1 = "cos";
        String x2 = "cos 2";

        miniAlgorytm(x1);
        miniAlgorytm(x2);
    }

    private void miniAlgorytm(String x) {
        //?????
        //??????
        System.out.println(x);
    }
}
