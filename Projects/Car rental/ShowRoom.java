package git ;
import java.util.Scanner;


class Car {
    String model;
    int year;
    double pricePerDay;
    boolean isAvailable;

    public Car(String model, int year, double pricePerDay) {
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public void displayCarInfo() {
        System.out.println(model + " (" + year + ") - $" + pricePerDay + "/day - " + (isAvailable ? "Available" : "Rented"));
    }
}

public class ShowRoom {
    static Car[] cars;
    static int carCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to the Car ShowRoom ===");
        System.out.print("Enter how many cars you want to add to the showroom: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        cars = new Car[n];

        // Let the user enter car data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");
            System.out.print("Model: ");
            String model = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            System.out.print("Price per day: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            cars[carCount++] = new Car(model, year, price);
        }

        boolean running = true;

        while (running) {
            System.out.println("\n1. Show available cars");
            System.out.println("2. Rent a car");
            System.out.println("3. Return a car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    showAvailableCars();
                    break;
                case 2:
                    rentCar(sc);
                    break;
                case 3:
                    returnCar(sc);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for visiting the ShowRoom!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }

    static void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (int i = 0; i < carCount; i++) {
            System.out.print((i + 1) + ". ");
            cars[i].displayCarInfo();
        }
    }

    static void rentCar(Scanner sc) {
        showAvailableCars();
        System.out.print("Enter the number of the car you want to rent: ");
        int carNumber = sc.nextInt();
        sc.nextLine();

        if (carNumber < 1 || carNumber > carCount) {
            System.out.println("Invalid car number.");
            return;
        }

        Car car = cars[carNumber - 1];
        if (car.isAvailable) {
            car.isAvailable = false;
            System.out.println("You have rented " + car.model + ". Enjoy your ride!");
        } else {
            System.out.println("Sorry, this car is already rented.");
        }
    }

    static void returnCar(Scanner sc) {
        System.out.print("Enter the number of the car you are returning: ");
        int carNumber = sc.nextInt();
        sc.nextLine();

        if (carNumber < 1 || carNumber > carCount) {
            System.out.println("Invalid car number.");
            return;
        }

        Car car = cars[carNumber - 1];
        if (!car.isAvailable) {
            car.isAvailable = true;
            System.out.println("You have returned " + car.model + ". Thank you!");
        } else {
            System.out.println("This car was not rented.");
        }
    }
}
