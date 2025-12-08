//program to test  coffe order
//Name:Mercy kakuko
//Reg no:S08-842-2024

import java.text.DecimalFormat;

class CoffeeOrder {
    String size;
    double price;

    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Coffee size: " + size + " | Price: $" + df.format(price));
    }
}

public class CoffeeOrderTest {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Small", 2.50);
        CoffeeOrder order2 = new CoffeeOrder("Large", 4.00);

        // Display the details of each order
        System.out.println("Order 1:");
        order1.displayDetails();
        System.out.println("Order 2:");
        order2.displayDetails();
    }
}
	}
}