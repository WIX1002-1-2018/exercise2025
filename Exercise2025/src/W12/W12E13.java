package W12;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E13 - Combining Interfaces, Abstract Classes, and Polymorphism
 *
 * CONTEXT: Capstone exercise combining W10/W11 (classes, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Define interfaces that specify behavior contracts
 * - Create abstract classes that implement interfaces
 * - Use polymorphism with both interface and abstract class types
 * - Combine method overriding, overloading, and interface implementation
 * - Handle multiple inheritance through interfaces
 */
public class W12E13 {

    public static void main(String[] args) {
        // Input data: vehicle type with specifications
        String vehicles = "CAR 2000\nBIKE 150\nCAR 1500\nBIKE 120";
        
        // Array to store polymorphic vehicle objects
        VehicleTransportE13[] fleet = new VehicleTransportE13[10];
        int count = 0;

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(vehicles);
             PrintWriter writer = new PrintWriter("W12E13_fleet.txt")) {
            
            // Set locale for consistent number parsing (US format)
            scanner.useLocale(Locale.US);

            // Parse input tokens and create vehicle objects
            while (scanner.hasNext() && count < fleet.length) {
                String type = scanner.next();
                
                if (scanner.hasNextDouble()) {
                    double weight = scanner.nextDouble();
                    
                    // Create appropriate vehicle based on type
                    if ("CAR".equalsIgnoreCase(type)) {
                        fleet[count++] = new CarE13(weight);
                    } else if ("BIKE".equalsIgnoreCase(type)) {
                        fleet[count++] = new BikeE13(weight);
                    }
                }
            }

            // Process fleet using polymorphism with interface type
            writer.println("Fleet Management System");
            writer.println("=======================\n");
            
            double totalFuelCost = 0;
            double totalEmissions = 0;
            
            for (int i = 0; i < count; i++) {
                // Polymorphic call using interface type VehicleTransportE13
                // Actual method resolved at runtime based on object's real type
                writer.println(fleet[i].describe());
                
                // Calculate fuel cost (uses overridden method)
                double fuelCost = fleet[i].calculateFuelCost();
                writer.println("  Fuel cost: $" + String.format(Locale.US, "%.2f", fuelCost));
                
                // Calculate fuel cost with custom fuel price (overloaded method)
                double costWithDiscount = fleet[i].calculateFuelCost(0.8);
                writer.println("  Fuel cost (20% discount): $" + 
                               String.format(Locale.US, "%.2f", costWithDiscount));
                
                // Calculate emissions (interface method)
                double emissions = fleet[i].calculateEmissions();
                writer.println("  Emissions: " + String.format(Locale.US, "%.2f", emissions) + " kg CO2\n");
                
                totalFuelCost += fuelCost;
                totalEmissions += emissions;
            }
            
            // Write summary
            writer.println("Fleet Summary:");
            writer.println("  Total fuel cost: $" + String.format(Locale.US, "%.2f", totalFuelCost));
            writer.println("  Total emissions: " + String.format(Locale.US, "%.2f", totalEmissions) + " kg CO2");
            
            System.out.println("Fleet report saved to W12E13_fleet.txt");
            
        } catch (Exception e) {
            System.out.println("Error processing vehicles: " + e.getMessage());
        }
    }
}

// INTERFACE 1: Defines what a transportable object must do
// Interfaces specify a contract that implementing classes must follow
interface TransportableE13 {
    // Calculate the cost to transport this object
    double calculateFuelCost();
    
    // Overloaded version: with price multiplier
    double calculateFuelCost(double priceMultiplier);
}

// INTERFACE 2: Defines environmental impact contract
interface EnvironmentallyResponsibleE13 {
    // Calculate emissions produced
    double calculateEmissions();
    
    // Get environmental impact description
    String getImpactDescription();
}

// ABSTRACT CLASS: Implements both interfaces
// Abstract classes can partially implement interfaces and provide shared functionality
// Classes must override all abstract methods or be marked abstract
abstract class VehicleTransportE13 implements TransportableE13, EnvironmentallyResponsibleE13 {
    // Protected: accessible in subclasses
    protected final double weight;  // vehicle weight in kg
    protected static final double BASE_FUEL_PRICE = 5.0;  // cost per 100 km per 1000 kg

    // Constructor
    VehicleTransportE13(double weight) {
        this.weight = weight;
    }

    // Abstract method: subclasses MUST implement their own fuel calculation
    // Different vehicle types have different fuel efficiency
    abstract double getFuelEfficiency();  // returns km per liter

    // Implement TransportableE13.calculateFuelCost()
    // Uses getFuelEfficiency() which is overridden by subclasses (polymorphism)
    @Override
    public double calculateFuelCost() {
        // Standard 100 km trip
        double distance = 100.0;
        // Calculate fuel needed based on efficiency
        double fuelNeeded = distance / getFuelEfficiency();
        // Calculate cost: base price adjusted for weight
        return fuelNeeded * BASE_FUEL_PRICE * (weight / 1000.0);
    }

    // Implement overloaded TransportableE13.calculateFuelCost(double)
    // Allows custom fuel price multipliers
    @Override
    public double calculateFuelCost(double priceMultiplier) {
        // Use base calculation and apply multiplier
        return calculateFuelCost() * priceMultiplier;
    }

    // Implement EnvironmentallyResponsibleE13.calculateEmissions()
    // Abstract: subclasses provide specific calculations
    @Override
    abstract double calculateEmissions();

    // Implement EnvironmentallyResponsibleE13.getImpactDescription()
    // Non-abstract: provides default implementation that subclasses can override
    @Override
    public String getImpactDescription() {
        return "Environmental impact category: " + getClass().getSimpleName();
    }

    // Additional method (not from interfaces)
    // Returns description of the vehicle
    String describe() {
        return getClass().getSimpleName() + " (weight: " + weight + " kg) - " + getImpactDescription();
    }
}

// CONCRETE CLASS 1: Car
// Implements the abstract class, which implements two interfaces
class CarE13 extends VehicleTransportE13 {
    // Static final: class constant for fuel efficiency
    private static final double FUEL_EFFICIENCY = 8.0;  // km per liter

    CarE13(double weight) {
        // Call parent constructor with super()
        super(weight);
    }

    // OVERRIDES abstract method getFuelEfficiency()
    @Override
    double getFuelEfficiency() {
        return FUEL_EFFICIENCY;
    }

    // OVERRIDES abstract method calculateEmissions()
    // Cars emit 2.3 kg CO2 per liter of fuel
    @Override
    public double calculateEmissions() {
        double distance = 100.0;
        double fuelNeeded = distance / getFuelEfficiency();
        return fuelNeeded * 2.3;  // kg CO2 per liter
    }
}

// CONCRETE CLASS 2: Bike
// Also implements the abstract class, providing different behavior
class BikeE13 extends VehicleTransportE13 {
    // Static final: class constant for fuel efficiency (motorcycles are more efficient)
    private static final double FUEL_EFFICIENCY = 20.0;  // km per liter

    BikeE13(double weight) {
        // Call parent constructor with super()
        super(weight);
    }

    // OVERRIDES abstract method getFuelEfficiency()
    @Override
    double getFuelEfficiency() {
        return FUEL_EFFICIENCY;
    }

    // OVERRIDES abstract method calculateEmissions()
    // Bikes emit less CO2 per liter due to weight
    @Override
    public double calculateEmissions() {
        double distance = 100.0;
        double fuelNeeded = distance / getFuelEfficiency();
        return fuelNeeded * 1.8;  // kg CO2 per liter (less than cars)
    }

    // OVERRIDES inherited method getImpactDescription()
    // Provides bike-specific description
    @Override
    public String getImpactDescription() {
        return "High efficiency, low emission vehicle";
    }
}
