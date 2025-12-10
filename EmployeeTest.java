//A program that accepts input for user name,salary and department
//It creates a lecturer object
//it displays all information using overriding method
//Reg no: S08-8427-2024
import java.util.Scanner;

//Main class to run the program
public class EmployeeTest {

    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void displayInfo() {
            System.out.println("Employee Name: " + name);
            System.out.printf("Employee Salary: $%.2f%n", salary);
        }
    }

    // Child class that inherits from Employee
    static class Lecturer extends Employee {
        String department;

        public Lecturer(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Lecturer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Lecturer Salary: $");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Lecturer myLecturer = new Lecturer(name, salary, department);

        System.out.println("\n--- Lecturer Details ---");

        myLecturer.displayInfo();

        scanner.close();
    }
}