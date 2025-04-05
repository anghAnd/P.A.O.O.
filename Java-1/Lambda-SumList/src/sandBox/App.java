package sandBox;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Crearea unui ArrayList de numere întregi
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Calcularea sumei folosind lambda cu forEach
        final int[] sum = {0}; // Folosim un tablou pentru a muta valoarea
        numbers.forEach(n -> sum[0] += n);  // adunăm fiecare număr la sum[0]

        // Afișăm rezultatul
        System.out.println("Suma numerelor din listă este: " + sum[0]);
    }
}