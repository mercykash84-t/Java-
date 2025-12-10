//Program that print prices and display amount
//Reg no:S08-8427-2024
public class ShoppingCart {
    public static void main(String[] args) {
        int[] prices = {120, 80, 150, 60, 200, 90};

        System.out.print("Item prices: ");
        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
            total += prices[i];
        }

        System.out.println("\nTotal amount = " + total);
    }
}