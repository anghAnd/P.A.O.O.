public class SquareToCircleAdapter {
    private Circle circle;

    public SquareToCircleAdapter(Circle circle) {
        this.circle = circle;
    }


    public void calculateArea(float length) {
        // Convertim lungimea (latura pătratului) într-o rază echivalentă
        float radius = length / (float) Math.sqrt(Math.PI);
        circle.calculateArea(radius);
    }

}
