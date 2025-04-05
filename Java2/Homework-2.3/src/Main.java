public class Main {
    public static ComplexNumber suma(Double nr1, Double nr2){
        double n = nr1+nr2;

        return AdapterFromDoubleToComplex.convert(n);
    }

   public static ComplexNumber suma(ComplexNumber nr1, Double nr2){
        // double r = nr1.real+ nr2;
        //double imaginary = nr1.imaginary;

       ComplexNumber compnr2 = AdapterFromDoubleToComplex.convert(nr2);
       return nr1.suma(compnr2);
   }

    public static ComplexNumber suma(Double nr1, ComplexNumber n2) {
        // Convertim Double într-un ComplexNumber
        ComplexNumber compnr1 = AdapterFromDoubleToComplex.convert(nr1);
        // Adunăm cele două numere complexe
        return compnr1.suma(n2);
    }

    public static void main(String[] args) {

        ComplexNumber nr1 = new ComplexNumber(3.0, 4.0); // 3 + 4i
        ComplexNumber nr2 = new ComplexNumber(1.0, 2.0); // 1 + 2i
        Double d1 = 5.0; // Număr real
        Double d2 = 6.0; // Alt număr real

        // Adunăm un ComplexNumber cu un Double
        ComplexNumber sumaComplexDouble = suma(nr1, d2);
        System.out.println("Suma : "+ nr1 + " + "+ d2 + " = " + sumaComplexDouble);

        // Adunăm un Double cu un ComplexNumber
        ComplexNumber sumaDoubleComplex = suma(d1, nr2);
        System.out.println("Suma : "+ d1 + " + " +nr2 + " = " + sumaDoubleComplex);
    }

}