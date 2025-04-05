import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream file = null;

        try{
            file=new FileInputStream("ec2");
            int character;

            while((character= file.read())!=-1){
                System.out.println((char) character);
            }

        }catch (FileNotFoundException e){
            System.out.println("Fisierul nu a fost gasit: "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("A apărut o eroare la citirea fișierului: " + e.getMessage());
        } finally {
            try{
                if(file!=null){
                    file.close();
                }
            }catch (IOException e){
                System.out.println("Eroare la inchiderea fisierului: " + e.getMessage());
            }
        }

    }
}