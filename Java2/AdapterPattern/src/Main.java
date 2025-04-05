//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Creăm obiectele originale
        Square square = new Square();
        Circle circle = new Circle();

        // Creăm adapterele pentru aceste obiecte
       SquareToCircleAdapter squaretocircle= new SquareToCircleAdapter(square);


        // Folosim adapterele pentru a apela metodele
        squaretocircle.calculateArea(4.0f);  // Aria patratului
        circle.calculateArea(3.0f);  // Aria cercului
    }

}