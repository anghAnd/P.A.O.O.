public class Main {
    public static void main(String[] args) {
     B obj = new B(19,"Alex",24.8);
   System.out.println(obj);
    }

    static class B {
        private int a;
        private String nume;
        private double valoare;

        public B(int a, String nume, double valoare) {
            this.a = a;
            this.nume = nume;
            this.valoare = valoare;
        }

        @Override
        public String toString() {

            return "B{ " + "a=" + a + ",nume= " + nume + ",valoare= " + valoare + "}";
        }
    }
}