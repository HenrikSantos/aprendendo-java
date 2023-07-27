import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int nProducts = sc.nextInt();

        List<Product> Products = new LinkedList<>();

        for (int i = 0; i < nProducts; i++) {
            System.out.println("Common, used or imported (c/u/i)");
            char typeOfProduct = sc.next().charAt(0);

            if (typeOfProduct == 'c') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                Products.add(new Product(name, price));
            }

            if (typeOfProduct == 'u') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Date: ");
                String date = sc.next();
                Products.add(new UsedProduct(name, price, date));
            }

            if (typeOfProduct == 'i') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Custom Fee");
                Double customFee = sc.nextDouble();
                Products.add(new ImportedProduct(name, price, customFee));
            }
        }

        System.out.println("Price Tags: ");
        for (Product Product: Products) {
            System.out.println(Product.priceTag());
        }

        sc.close();
    }
}