import java.util.Scanner;
public class EquationParameters {
    private int a;
    private int b;
    private int c;

    public EquationParameters(){}

    public EquationParameters(int a , int b , int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void ReadFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        this.a=scanner.nextInt();

        System.out.println("Enter value for b: ");
        this.b=scanner.nextInt();

        System.out.println("Enter value for c: ");
        this.c=scanner.nextInt();
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }
}
