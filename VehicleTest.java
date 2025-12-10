// A program that creates a car object,assign values to all attributes
//It prints all the details
//REG NO:S08-8427-2024
//Main class to run the program
public class VehicleTest {

    // Superclass
    static class Vehicle {
        String brand;
        int year;

        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        public void displayDetails() {
            System.out.println("Vehicle Brand: " + brand);
            System.out.println("Vehicle Year: " + year);
        }
    }

    // Subclass that inherits from Vehicle
    static class Car extends Vehicle {
        int seats;

        public Car(String brand, int year, int seats) {
            super(brand, year); 
            this.seats = seats;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Number of Seats: " + seats);
        }
    }

    public static void main(String[] args) {
        // Creates a Car object
        //Assigns values to all attributes
        Car myCar = new Car("Ford", 2024, 4);

        System.out.println("--- Car Details ---");

        //Prints all the details
        myCar.displayDetails();
    }
}