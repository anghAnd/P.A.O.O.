//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       boolean noEyeProblems;
       Ophthalmology ophthalmology ;
       Glasses whatGlassesNeed;
        noEyeProblems = false;

        ophthalmology = new Ophthalmology(noEyeProblems);
        whatGlassesNeed = ophthalmology.prepareGlasses();
        whatGlassesNeed.wear();
    }
}