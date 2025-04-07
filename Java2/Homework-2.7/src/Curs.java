import java.util.ArrayList;
import java.util.List;

public class Curs {

    private List<Student> studenti;

    public Curs() {
        this.studenti = new ArrayList<>();
    }

    public void inscrieStudent(Student student) {
        studenti.add(student);
    }

    public void prezenta() {
        System.out.println("📋 Prezenta la curs:");
        for (Student s : studenti) {
            String status = s.prezenta();
            System.out.println(s.getNume() + " - " + status);
        }
        System.out.println(); // Linie liberă pentru claritate
    }
}
