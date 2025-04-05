public class Main {
    public static void main(String[] args) {
        // Folosirea tipului primitiv 'int'
        int numarInt = 5;
        System.out.println("Valoare int: " + numarInt);

        // Folosirea tipului obiect 'Integer'
        Integer numarInteger = 10;
        System.out.println("Valoare Integer: " + numarInteger);

        // Demonstratie cu valori null
        Integer numarNull = null;
        System.out.println("Valoare Integer null: " + numarNull);

        // Convertirea între int și Integer
        Integer numarIntToInteger = numarInt; // Autoboxing
        System.out.println("Autoboxing din int la Integer: " + numarIntToInteger);

        int numarIntegerToInt = numarInteger; // Unboxing
        System.out.println("Unboxing din Integer la int: " + numarIntegerToInt);
    }
}