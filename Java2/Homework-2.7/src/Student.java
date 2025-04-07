import java.util.Random;

public class Student {
    private String nume;
    private Random prezent;

    public Student(String nume){
        this.nume = nume;
        this.prezent = new Random();
    }
    public String getNume() {
        return nume;
    }

    public String prezenta(){
              return prezent.nextBoolean() ? "prezent" : "absent";


    }
}
