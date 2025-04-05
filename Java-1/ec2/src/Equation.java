public class Equation {
    private final EquationParameters params;

    public Equation(EquationParameters params){
        this.params=params;
    }

    public Solution solve(){
        double a=params.getA();
        double b=params.getB();
        double c=params.getC();

        if(a==0) {
            return (b != 0) ? new Solution(0, "Linear solution: x = " + (-c / b)) : new Solution(1, "No solution");
        }else{
            double delta;
            delta = b*b - 4*a*c;
            if(delta>0){
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                return new Solution(0,"Two solutions: x1 = " + x1 + ", x2 = " + x2);
            }else if(delta==0){
                double x=-b/(2*a);
                return new Solution(0,"One solution: x= "+x);
            }else {
                return new Solution(1,"No real solutions");
            }

        }
    }


}
