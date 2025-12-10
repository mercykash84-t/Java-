//Program that delare 1D array,print elements and calculate sum
//Reg no:S08-8427-2024
public class Basic {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.print("Array elements: ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        System.out.println("\nSum of all elements = " + sum);
    }
}