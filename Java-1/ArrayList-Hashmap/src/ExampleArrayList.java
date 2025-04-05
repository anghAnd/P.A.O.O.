import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        // Crearea unui ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adăugarea unor elemente
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Afișarea conținutului ArrayList-ului
        System.out.println("Conținutul ArrayList-ului:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}