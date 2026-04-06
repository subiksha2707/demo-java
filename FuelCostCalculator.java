import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km/l): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per litre: ");
        double price = sc.nextDouble();

        double fuelNeeded = distance / mileage;   
        double totalCost = fuelNeeded * price;    

        System.out.println("Fuel Needed: " + fuelNeeded + " litres");
        System.out.println("Total Cost: " + totalCost);

        sc.close();
    }
}