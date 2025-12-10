//Program that decalres and initialize a 2D arrays containing student marks 
//It uses nested loop to print all the marks
//Reg no:S08-8427-2024
public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 70, 90},
            {60, 85, 75},
            {88, 92, 79}
        };

        System.out.println("Marks:");
        for (int r = 0; r < marks.length; r++) {
            for (int c = 0; c < marks[r].length; c++) {
                System.out.print(marks[r][c] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < marks[0].length; i++) {
            sum += marks[0][i];
        }

        double avg = sum / marks[0].length;
        System.out.println("Average of first row = " + avg);
    }
}