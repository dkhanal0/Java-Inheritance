package inheritance;

public class TaxableProduct extends Product {
private String productName;
private String ISBN;
private double unitPrice;

    public TaxableProduct(String productName, String ISBN, double unitPrice, String productName1) {
        super(productName, ISBN, unitPrice);

        this.productName = productName1;
        this.ISBN=ISBN;
        this.unitPrice=unitPrice;
    }

    @Override
    public String getIsbn() {
        return null;
    }
}
