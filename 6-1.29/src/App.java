public class App {
    public static void
    main(String[] args) {

        A a = new A(2, 11);  // Creează un obiect A cu x=2 și y=11
        B b = new B(a);  // Creează un obiect B care ține referința către A
        b.setXOnA(55);  // Modifică valoarea lui x al obiectului A la 55
        a.showData();  // Afișează valorile obiectului A, care acum sunt x=55 și y=11
        A a1 = new A(100, 200);  // Creează un alt obiect A cu x=100 și y=200

        b.changeA(a1);  // Modifică obiectul a1, setând x la 25, dar creează un alt obiect A (1000, 2000) care nu influențează a1
        a1.showData();  // Afișează valorile obiectului a1, care vor fi x=25 și y=200
    }
}
