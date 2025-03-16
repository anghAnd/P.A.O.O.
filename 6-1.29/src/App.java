public class App {
    public static void
    main(String[] args) {

        A a = new A(2, 11);
        B b = new B(a);
        b.setXOnA(55);
        a.showData();
        A a1 = new A(100, 200);

        b.changeA(a1);
        a1.showData();
    }
}