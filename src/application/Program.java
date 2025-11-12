package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("STOCK OF PRODUCT");
        System.out.print("Enter product name: ");
        product.name = sc.nextLine();

        System.out.print("Enter product price: ");
        product.price = sc.nextDouble();

        System.out.print("Enter product quantity in stock: ");
        product.quantity = sc.nextInt();

        int option = 0;

        // Menu com IF
        while (option != 4) {
            System.out.println();
            System.out.println("1 - Show product data");
            System.out.println("2 - Add products to stock");
            System.out.println("3 - Remove products from stock");
            System.out.println("4 - Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("\nProduct data: " + product);
            }
            else if (option == 2) {
                System.out.print("Enter quantity to add: ");
                int addQty = sc.nextInt();
                product.addProduct(addQty);
                System.out.println("Updated data: " + product);
            }
            else if (option == 3) {
                System.out.print("Enter quantity to remove: ");
                int removeQty = sc.nextInt();
                product.removeProduct(removeQty);
                System.out.println("Updated data: " + product);
            }
            else if (option == 4) {
                System.out.println("exiting the program");
            }
            else {
                System.out.println("Invalid option. Try again!");
            }
        }

        sc.close();
    }
}
