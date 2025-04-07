//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();
// Clasa anonima pentru aparatul de cafea
        prelungitor.adaugaAparat(new AparatElectric() {
            public void conectat() {
                System.out.println("Aparatul de cafea a fost conectat la curent.");
            }

            public void deconectat() {
                System.out.println("Aparatul de cafea a fost deconectat de la curent.");
            }
        });

        // Clasa anonima pentru frigider
        prelungitor.adaugaAparat(new AparatElectric() {
            public void conectat() {
                System.out.println("Frigiderul a fost conectat la curent.");
            }

            public void deconectat() {
                System.out.println("Frigiderul a fost deconectat de la curent.");
            }
        });

        prelungitor.conecteazaLaPriza();
        System.out.println("---");
        prelungitor.deconecteazaDeLaPriza();

    }
}