public class A {
    private int x, y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;

    }
    public void showData() {
        System.out.println("x=" + x +
                " y=" + y);
    }
}

