package W12;

/**
 * W12E15 - Upcasting and Safe Downcasting with instanceof
 *
 * CONTEXT: Capstone exercise on type conversion in inheritance hierarchies.
 * LEARNING OBJECTIVES:
 * - Understand Upcasting (automatic, safe): Child to Parent reference
 * - Understand Downcasting (requires instanceof check): Parent to Child reference
 * - Use instanceof operator to safely check object type before downcasting
 * - Avoid ClassCastException by validating types at runtime
 * - Demonstrate polymorphic processing with conditional downcasting
 */
public class W12E15 {

    public static void main(String[] args) {
        System.out.println("=== UPCASTING (Child -> Parent) ===\n");
        
        // UPCASTING: Convert child reference to parent type
        // This is ALWAYS SAFE and happens implicitly
        
        VehicleE15 car = new CarE15("Toyota Corolla", 180);  // Parent reference, car object
        VehicleE15 bike = new BikeE15("Yamaha YZF", 240);    // Parent reference, bike object
        
        System.out.println("Upcasting Examples:");
        System.out.println("  CarE15 object stored as VehicleE15: " + car.describe());
        System.out.println("  BikeE15 object stored as VehicleE15: " + bike.describe());
        
        // Array of parent type can hold child objects (upcasting)
        VehicleE15[] vehicles = { car, bike };
        System.out.println("\n  Parent type array contains child objects:");
        for (VehicleE15 v : vehicles) {
            System.out.println("    " + v.describe());
        }
        
        System.out.println("\n=== DOWNCASTING (Parent -> Child) ===\n");
        
        System.out.println("Downcasting with instanceof (SAFE METHOD):");
        
        // Process vehicles: some need specific child class methods
        for (VehicleE15 vehicle : vehicles) {
            // Polymorphic call (works for all vehicles)
            System.out.println("  Vehicle: " + vehicle.describe());
            
            // SAFE DOWNCASTING: Check type BEFORE casting
            if (vehicle instanceof CarE15) {
                // Now it's SAFE to cast to CarE15
                CarE15 myCar = (CarE15) vehicle;
                System.out.println("    -> Car specific: Trunk capacity = " + myCar.getTrunkCapacity() + " L");
            } 
            else if (vehicle instanceof BikeE15) {
                // Now it's SAFE to cast to BikeE15
                BikeE15 myBike = (BikeE15) vehicle;
                System.out.println("    -> Bike specific: Chain type = " + myBike.getChainType());
            }
            System.out.println();
        }
        
        System.out.println("\n=== UNSAFE DOWNCASTING (Without instanceof) ===\n");
        
        System.out.println("What happens WITHOUT instanceof check:");
        System.out.println("  (This would crash if executed incorrectly)");
        
        VehicleE15 unknownVehicle = vehicles[0];  // Could be Car or Bike
        
        // WRONG: Casting without checking type
        // This would throw ClassCastException if unknownVehicle is actually a Bike
        // try {
        //     BikeE15 wrongBike = (BikeE15) unknownVehicle;  // DANGEROUS!
        //     System.out.println(wrongBike.getChainType());  // May crash!
        // } catch (ClassCastException e) {
        //     System.out.println("ERROR: " + e.getMessage());
        // }
        
        System.out.println("  (Commented out to prevent errors in this demo)\n");
        
        System.out.println("\n=== PRACTICAL EXAMPLE: Processing Mixed Collections ===\n");
        
        // Create a more complex scenario
        VehicleE15[] fleet = {
            new CarE15("Honda Civic", 200),
            new BikeE15("Kawasaki Ninja", 300),
            new CarE15("Ford Mustang", 240),
            new BikeE15("Harley Davidson", 200)
        };
        
        int totalCarTrunk = 0;
        int carCount = 0;
        int bikeCount = 0;
        
        System.out.println("Fleet Analysis (using instanceof + downcasting):\n");
        
        for (VehicleE15 vehicle : fleet) {
            // Use instanceof to check type and safely downcast
            if (vehicle instanceof CarE15) {
                CarE15 car_obj = (CarE15) vehicle;
                totalCarTrunk += car_obj.getTrunkCapacity();
                carCount++;
                System.out.println("  CAR: " + car_obj.describe() + 
                                   " | Trunk: " + car_obj.getTrunkCapacity() + "L");
            } else if (vehicle instanceof BikeE15) {
                BikeE15 bike_obj = (BikeE15) vehicle;
                bikeCount++;
                System.out.println("  BIKE: " + bike_obj.describe() + 
                                   " | Chain: " + bike_obj.getChainType());
            }
        }
        
        System.out.println("\n  Summary:");
        System.out.println("    Cars: " + carCount + " (Total trunk: " + totalCarTrunk + "L)");
        System.out.println("    Bikes: " + bikeCount);
        
        System.out.println("\n=== KEY POINTS ===\n");
        System.out.println("Upcasting (Child -> Parent):");
        System.out.println("  - ALWAYS SAFE (implicit, automatic)");
        System.out.println("  - Can lose child-specific methods and fields");
        System.out.println("  - Enables polymorphism and generic processing");
        
        System.out.println("\nDowncasting (Parent -> Child):");
        System.out.println("  - POTENTIALLY UNSAFE (explicit cast required)");
        System.out.println("  - MUST check with instanceof first");
        System.out.println("  - Allows access to child-specific methods and fields");
        System.out.println("  - Risk: ClassCastException if cast is incorrect");
    }
}

// ============================================================================
// INHERITANCE HIERARCHY
// ============================================================================

abstract class VehicleE15 {
    protected String name;
    protected int maxSpeed;
    
    public VehicleE15(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    
    public abstract String describe();
}

class CarE15 extends VehicleE15 {
    private int trunkCapacity;  // Car-specific field
    
    public CarE15(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.trunkCapacity = 400;  // Default trunk capacity in liters
    }
    
    @Override
    public String describe() {
        return name + " (Car, max speed: " + maxSpeed + " km/h)";
    }
    
    // Car-specific method (accessible only after downcasting)
    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}

class BikeE15 extends VehicleE15 {
    private String chainType;  // Bike-specific field
    
    public BikeE15(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.chainType = "Heavy-duty chain";  // Default chain type
    }
    
    @Override
    public String describe() {
        return name + " (Bike, max speed: " + maxSpeed + " km/h)";
    }
    
    // Bike-specific method (accessible only after downcasting)
    public String getChainType() {
        return chainType;
    }
}
