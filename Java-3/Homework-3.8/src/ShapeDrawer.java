import java.util.List;

public class ShapeDrawer {
    public void drawAll(List<Drawable> shapes) {
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

