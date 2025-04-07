public class Produs {

    private int id;
    private String nume;
    private double pretLEI;

    public Produs(int id,String nume, double pretLEI){
        this.id = id;
        this.nume = nume;
        this.pretLEI =pretLEI;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPretLei() {
        return pretLEI;
    }

    @Override
    public String toString() {
        return "Produs(id=" + id + ", nume=" + nume + ", pretLei=" + pretLEI + ")";
    }

}
