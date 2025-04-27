import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        List<Shape> shapes = Arrays.asList(circle, rectangle);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sumAreas(shapes);

        System.out.println("Total area: " + totalArea);
    }
}