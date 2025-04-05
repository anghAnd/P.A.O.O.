public class AdapterFromDoubleToComplex {
    public static ComplexNumber convert(Double d){
        return new ComplexNumber(d,0);
    }

    public static double convertToDouble(ComplexNumber c){
        return c.modulus();
    }

}
