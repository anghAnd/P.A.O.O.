import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        // Crearea unui HashMap
        HashMap<String, Integer> fruitPrices = new HashMap<>();

        // Adăugarea unor perechi cheie-valoare
        fruitPrices.put("Apple", 3);
        fruitPrices.put("Banana", 1);
        fruitPrices.put("Cherry", 2);

        // Afișarea conținutului HashMap-ului
        System.out.println("Conținutul HashMap-ului:");
        for (String fruit : fruitPrices.keySet()) {
            System.out.println(fruit + ": " + fruitPrices.get(fruit));
        }
    }
}