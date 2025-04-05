import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // Crearea unei liste de numere
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Folosirea map() pentru a crea un flux de pătrate ale numerelor
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n) // Transformă fiecare element în pătratul său
                .collect(Collectors.toList());
        System.out.println("Numere pătrate: " + squaredNumbers);

        // 2. Folosirea filter() pentru a păstra doar numerele pare
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Păstrează doar numerele pare
                .collect(Collectors.toList());
        System.out.println("Numere pare: " + evenNumbers);

        // 3. Folosirea sort() pentru a sorta lista
        List<Integer> sortedNumbers = numbers.stream()
                .sorted() // Sortează în ordine crescătoare
                .collect(Collectors.toList());
        System.out.println("Numere sortate: " + sortedNumbers);

        // 4. Combinația map(), filter() și sort()
        List<Integer> result = numbers.stream()
                .map(n -> n * n)      // Pătratul fiecărui număr
                .filter(n -> n % 2 == 0) // Păstrează doar pătratele pare
                .sorted()             // Sortează rezultatul
                .collect(Collectors.toList());

        System.out.println("Rezultatul final (pătrate pare, sortate): " + result);
    }
}