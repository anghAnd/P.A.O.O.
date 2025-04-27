//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Ana Popescu", 1001);
        EmployeeSaver saver = new EmployeeSaver();
        saver.saveToFile(emp);

    }
}