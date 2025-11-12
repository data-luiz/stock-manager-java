package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "\nname: " + name + "\n"
                + "price: $" + String.format("%.2f", price) + "\n"
                + "quantity: " + quantity + " units" + "\n"
                + "total: $" + String.format("%.2f", totalValueInStock());
    }
}