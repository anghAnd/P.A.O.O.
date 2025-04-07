public class Adapter {
    private double exchangeRate;

    public Adapter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Produs productToProdus(Product product) {
        double pretLei = product.getPriceUsd() * exchangeRate;
        return new Produs(product.getId(), product.getName(), pretLei);
    }

    public Product produsToProduct(Produs produs) {
        double priceUsd = produs.getPretLei() / exchangeRate;
        return new Product(produs.getId(), produs.getNume(), priceUsd);
    }
}
