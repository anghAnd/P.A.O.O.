package org.example;

public class EquationResult {
    private String status;
    private Double solution;

    public EquationResult(String status, Double solution) {
        this.status = status;
        this.solution = solution;
    }

    public String getStatus() {
        return status;
    }

    public Double getSolution() {
        return solution;
    }
}
