package entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order {
    private final Date date = Calendar.getInstance().getTime();

    private OrderStatus status = OrderStatus.PENDING_PAYMENT;

    private final Client cliente;

    public Order(Client cliente) {
        this.cliente = cliente;
    }
    ArrayList<OrderItem> products = new ArrayList<>();

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        products.add(item);
    }

    public void addRemove(OrderItem item) {
        products.remove(item);
    }

    public Double total() {
        Double total = 0.0;

        for (OrderItem product: products) {
            total += product.subTotal();
        }

        return total;
    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order {\n");
        sb.append("  Date: ").append(date).append("\n");
        sb.append("  Status: ").append(status).append("\n");
        sb.append("  Cliente: ").append(cliente.name).append("\n");
        sb.append("  Products:\n");

        DecimalFormat df = new DecimalFormat("#,##0.00");

        for (OrderItem product : products) {
            sb.append("    - ").append(product.product.getName());
            sb.append(", Quantity: ").append(product.quantity);
            sb.append(", Price: R$").append(df.format(product.product.getPrice()));
            sb.append(", Subtotal: R$").append(df.format(product.subTotal())).append("\n");
        }
        sb.append("  Total: R$").append(df.format(total())).append("\n");
        sb.append("}");

        return sb.toString();
    }
}
