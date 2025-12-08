// program to Calculate Total Cost of vacation
//Name: Mercy Kakuko
//Reg no: S08-8427-2024
public class VacationCost {
    public static double calculateTotalCost(double accommodationCost,
                                            double mealCost,
                                            double activityCost) {

        // Add all the 3 expenses
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {

        // Define sample data provided by the question
        double accommodation = 900.50;
        double meals = 350.25;
        double activities = 200.00;

        // Calculate the total cost
        double total = calculateTotalCost(accommodation, meals, activities);

        // Print total cost
        System.out.println("Total Vacation Cost: " + total);
    }
}
