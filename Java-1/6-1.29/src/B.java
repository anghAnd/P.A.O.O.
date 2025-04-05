public class B {
    private A a;
    public B(A a) {
        this.a = a;
    }
    public void setXOnA(int x) {
        this.a.setX(x);
    }
    public void changeA(A a) {
        a.setX(25);
        a = new A(1000, 2000);
    }
}

