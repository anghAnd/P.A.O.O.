//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
            public static void main(String[] args) {
                Curs curs = new Curs();

                // Adăugăm câțiva studenți
                curs.inscrieStudent(new Student("Ana"));
                curs.inscrieStudent(new Student("Alin"));
                curs.inscrieStudent(new Student("Ioana"));
                curs.inscrieStudent(new Student("George"));

                // Apelăm metoda prezenta de mai multe ori
                curs.prezenta();
                curs.prezenta();
                curs.prezenta();
            }
}


