//program to demonstrate a product
//Name:Mercy kakuko
//Reg no:S08-8427-2024
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percent) {
        double discountAmount = price * (percent / 100);
        price = price - discountAmount;
    }

    double getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product p = new Product("Phone", 500);

        System.out.print("Enter discount percentage: ");
        double percent = input.nextDouble();

        p.applyDiscount(percent);

        System.out.println("Price after discount: " + p.getPrice());
    }
}