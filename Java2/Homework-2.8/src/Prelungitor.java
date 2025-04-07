import java.util.ArrayList;
import java.util.List;
public class Prelungitor {
    private List<AparatElectric> aparate = new ArrayList<>();
       private boolean conect = false;

    public void adaugaAparat(AparatElectric aparat) {
        aparate.add(aparat);
    }

    public void conecteazaLaPriza() {
        if (!conect) {
            System.out.println("Prelungitorul a fost conectat la priza.");
            conect = true;
            for (AparatElectric aparat : aparate) {
                aparat.conectat();
            }
        }
    }
    public void deconecteazaDeLaPriza() {
        if (conect) {
            System.out.println("Prelungitorul a fost deconectat de la priza.");
            conect = false;
            for (AparatElectric aparat : aparate) {
                aparat.deconectat();
            }
        }
    }
}
