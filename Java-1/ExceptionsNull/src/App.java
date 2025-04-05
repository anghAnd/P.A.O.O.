import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    int readNumber() {
        Scanner in = new Scanner(System.in);
        int nr;
        try {
            nr = in.nextInt();
        } catch (InputMismatchException e) {
            nr = -1;
        }
        return nr;
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.out.println("It works");
        App app1 = new App();
        int nr1, nr2, sum;
        nr1 = app1.readNumber();
        nr2 = app1.readNumber();
        sum = nr1 + nr2;
        System.out.println("Suma:" + sum);
    }
}