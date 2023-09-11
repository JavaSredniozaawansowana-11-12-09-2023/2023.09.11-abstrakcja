package pl.comarch.szkolenia.abstrakcja.interfejsy;

public class Main2 {
    public static void main(String[] args) {
        InterfejsZMetodamiPrywatnymi i = new ImplementacjaInterfejsuZMetodaPrywatna();
        i.metoda();

        System.out.println(Dog.name);
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        System.out.println(d1.name);
        System.out.println(d2.name);

        Dog.name = "Rex";
        System.out.println(Dog.name);
        System.out.println(d1.name);
        System.out.println(d2.name);

        /*Interfejs1 i1 = new Interfejs1();
        i1.a();*/
    }
}
