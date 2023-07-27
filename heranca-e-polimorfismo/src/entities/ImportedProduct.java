package entities;

public class ImportedProduct extends Product {
    private final Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s - $ %.2f (Custom fee: $ %.2f", super.getName(), totalPrice(), customsFee);
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }
}
