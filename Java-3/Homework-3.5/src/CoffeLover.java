import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

    public CoffeLover() {
        coffeMachines = new ArrayList<>();

        // Userul creează aici propriile mașini de cafea:
        coffeMachines.add(new SimpleCoffeMachine());
        coffeMachines.add(new ComplexCoffeMachine());
    }

    public void makeCoffe() {
        coffeMachines.forEach(CoffeMachine::start);
    }
}
