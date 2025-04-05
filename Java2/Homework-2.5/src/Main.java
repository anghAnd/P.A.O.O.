//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    C2Nr c2nr = new C2Nr(1,4);
    System.out.println("Suma din C2Nr este:  "+ c2nr.getSum());

        C3Nr c3nr = new C3Nr(1, 2, 3);
        System.out.println("Suma din C3Nr: " + c3nr.getSum());

        C3Nr c3NrFromC2 = AdapterFromC2ToC3.convert(c2nr);
        System.out.println("Suma din C3Nr (după conversia din C2Nr): " + c3NrFromC2.getSum());
    }
}