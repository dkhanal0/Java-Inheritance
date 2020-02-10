package inheritance;

public class TaxableProduct extends Product {
private String productName;
private String ISBN;
private double unitPrice;

    public TaxableProduct(String productName, String ISBN, double unitPrice) {
        super(productName, ISBN, unitPrice);

    }

}
