//Program that print all stock values using 3 nested loops and calculate,display the total stock in warehouse2
//Reg no:S08-8427-2024
public class WarehouseStock {
    public static void main(String[] args) {
        int[][][] stock = {
            { {50, 30, 20}, {40, 25, 15} },
            { {60, 35, 25}, {55, 28, 18} }
        };

        System.out.println("Stock:");
        for (int w = 0; w < stock.length; w++) {
            System.out.println("Warehouse " + (w + 1) + ":");
            for (int s = 0; s < stock[w].length; s++) {
                for (int p = 0; p < stock[w][s].length; p++) {
                    System.out.print(stock[w][s][p] + " ");
                }
                System.out.println();
            }
        }

        int total = 0;
        for (int s = 0; s < stock[1].length; s++) {
            for (int p = 0; p < stock[1][s].length; p++) {
                total += stock[1][s][p];
            }
        }

        System.out.println("Total for Warehouse 2 = " + total);
    }
}