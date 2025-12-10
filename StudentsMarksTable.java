//Program that print marks in table form and calculates,print averag3 marks of student 3
//Reg no:S08-8427-2024
public class StudentMarksTable {
    public static void main(String[] args) {
        int[][] table = {
            {75, 80, 90},
            {65, 70, 85},
            {88, 92, 81}
        };

        System.out.println("Marks table:");
        for (int i = 0; i < table.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for (int j = 0; j < table[2].length; j++) {
            sum += table[2][j];
        }

        double avg = sum / table[2].length;
        System.out.println("Average of Student 3 = " + avg);
    }
}