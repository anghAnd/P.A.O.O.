//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Product product = new Product(12,"Ana",300.0);
     Adapter adapter = new Adapter(4.5);

     Produs produs = adapter.productToProdus(product);
     System.out.print(produs);

     Product backToProduct = adapter.produsToProduct(produs);
     System.out.println(backToProduct);

    }
}