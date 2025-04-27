package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinearEquationSolver solver = new LinearEquationSolver();

        // Exemplu: 2x - 4 = 0
        double a = 2;
        double b = -4;

        EquationResult result = solver.solve(a, b);

        JsonSaver saver = new JsonSaver();
        saver.saveToFile(result, "equation_result.json");

        System.out.println("Rezultat salvat cu succes!");
    }
}