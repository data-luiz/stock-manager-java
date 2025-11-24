package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("STOCK OF PRODUCT");
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity in stock: ");
            int quantity = sc.nextInt();

            Product product = new Product(name, price, quantity);

            int option = 0;

            while (option != 5) {
                System.out.println();
                System.out.println("1 - Show product data");
                System.out.println("2 - Add products to stock");
                System.out.println("3 - Remove products from stock");
                System.out.println("4 - Updated product");
                System.out.println("5 - Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                option = sc.nextInt();

                if (option == 1) {
                    System.out.println("\nProduct data: " + product);
                } else if (option == 2) {
                    System.out.print("Enter quantity to add: ");
                    int addQty = sc.nextInt();
                    product.addProduct(addQty);
                    System.out.println("Updated data: " + product);
                } else if (option == 3) {
                    System.out.print("Enter quantity to remove: ");
                    int removeQty = sc.nextInt();
                    product.removeProduct(removeQty);
                    System.out.println("Updated data: " + product);
                } else if (option == 4) {
                    sc.nextLine();
                    System.out.print("Enter new product name: ");
                    String newName = sc.nextLine();
                    product.setName(newName);
                    System.out.print("Enter new product price: ");
                    double newPrice = sc.nextDouble();
                    product.setPrice(newPrice);
                    System.out.println("Updated data: " + product);
                } else if (option == 5) {
                    System.out.println("exiting the program");
                } else {
                    System.out.println("Invalid option. Try again!");
                }
            }

            sc.close();
        }
    }
}
