public class AdapterFromC2ToC3 {

    public static C3Nr convert(C2Nr c2nr){
        return new C3Nr(c2nr.getSum(),0,0);
    }
}
