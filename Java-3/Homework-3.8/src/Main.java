import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        List<Drawable> shapes = Arrays.asList(circle, rectangle);

        ShapeDrawer drawer = new ShapeDrawer();
        drawer.drawAll(shapes);
    }
}
