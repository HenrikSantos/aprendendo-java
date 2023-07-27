import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Client Mareusa = new Client("Mareusa", "mareusa@gmail.com", "05/08/1962");
        Order pedido = new Order(Mareusa);

        Product energetico = new Product("Monster", 3.99);
        OrderItem itemOrder01 = new OrderItem(2, energetico);
        pedido.addItem(itemOrder01);

        Product salgadinho = new Product("Lays 300g", 2.36);
        OrderItem itemOrder02 = new OrderItem(2, salgadinho);
        pedido.addItem(itemOrder02);

        System.out.println(pedido);
    }
}