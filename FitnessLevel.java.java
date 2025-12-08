// program to get fitness level
//Name:Mercy Kakuko
//Reg no:S08-8427-2024

import java.util.Scanner;

public class FitnessLevel {

    // Returns a fitness level depending on the number of steps
    public static String classifyFitness(int steps) {

        if (steps < 5000) {
            return "Low";
        } else if (steps < 8000) {
            return "Moderate";
        } else {
            return "High";
        }
    }

    public static void main(String[] args) {

        // Scanner for reading step input
        Scanner input = new Scanner(System.in);

        // Ask the user for steps
        System.out.print("Enter your step count: ");
        int steps = input.nextInt();

        // Get the fitness level
        String level = classifyFitness(steps);

        // Show the result
        System.out.println("Your fitness level is: " + level);

        input.close(); // good practice
    }
}