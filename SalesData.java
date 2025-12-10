//Program that prints all the elements using 3 nested loops
//Reg no:S08-8427-2024
public class SalesData {
    public static void main(String[] args) {
        int[][][] sales = {
            { {10, 20, 30}, {15, 25, 35} },
            { {5, 10, 15}, {8, 16, 24} }
        };

        System.out.println("Sales:");
        for (int b = 0; b < sales.length; b++) {
            System.out.println("Branch " + (b + 1) + ":");
            for (int m = 0; m < sales[b].length; m++) {
                for (int p = 0; p < sales[b][m].length; p++) {
                    System.out.print(sales[b][m][p] + " ");
                }
                System.out.println();
            }
        }

        int total = 0;
        for (int m = 0; m < sales[0].length; m++) {
            for (int p = 0; p < sales[0][m].length; p++) {
                total += sales[0][m][p];
            }
        }

        System.out.println("Total for Branch 1 = " + total);
    }
}