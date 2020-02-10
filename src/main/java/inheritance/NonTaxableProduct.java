package inheritance;

public class NonTaxableProduct extends Product {


    public NonTaxableProduct(String productName, String ISBN, double unitPrice) {
        super(productName, ISBN, unitPrice);



    }

    @Override
    public String getIsbn() {
        return null;
    }

}
