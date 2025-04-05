//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=12;
        instanta.f(a);
        System.out.println(a);

    }

    class instanta{
        //nu se schimba valoarea lui a
        static void f(int a)
        {
            a=a+1;
        }
        //
    }

}