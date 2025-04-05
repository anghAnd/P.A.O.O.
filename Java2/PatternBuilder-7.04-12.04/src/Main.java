//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
       Majorat majorat = new Majorat.Builder()
               .cuMuzica("Faydee")
               .cuLocal("Voila")
               .cuInvitati(80)
               .cuMancare("bufet")
               .cuTort("Tort Trio de Ciocolată")
               .cuArtificii(true)
               .build();

       System.out.println(majorat);
    }
}