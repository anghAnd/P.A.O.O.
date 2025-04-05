public class Ophthalmology {
    private boolean noEyeProblems;

    public Ophthalmology(boolean noEyeProblems){
       this.noEyeProblems = noEyeProblems;
    }
    Glasses prepareGlasses(){
        if(this.noEyeProblems){
            return new EyeGlasses();
        }
        else{
            return new SunGlasses();
        }
    }
}

