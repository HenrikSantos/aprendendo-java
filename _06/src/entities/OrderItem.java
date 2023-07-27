package entities;

public class OrderItem {
    public Integer quantity;
    public Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Double subTotal() {
        return quantity * product.getPrice();
    }
}
