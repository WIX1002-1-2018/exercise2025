package W12;

/**
 * W12E02 - Overriding with super
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Extend a base class and reuse behavior with super
 * - Override methods to customize output
 * - Overload a method to accept different parameter sets
 */
public class W12E02 {

    public static void main(String[] args) {
        // Create a regular vehicle with name and maximum speed
        VehicleE02 van = new VehicleE02("Delivery Van", 60);
        
        // Create an electric vehicle (subclass) with name, max speed, and battery percentage
        ElectricVehicleE02 ev = new ElectricVehicleE02("Campus EV", 90, 80);

        // Demonstrate polymorphism: store different vehicle types in a parent class array
        // Both VehicleE02 and ElectricVehicleE02 objects can be stored as VehicleE02 type
        VehicleE02[] fleet = { van, ev };
        
        // Iterate through the fleet and call methods on each vehicle
        for (VehicleE02 vehicle : fleet) {
            // Call the single-parameter startTrip method
            // For ElectricVehicleE02, the overridden version will be called (runtime polymorphism)
            vehicle.startTrip("Library");
            
            // Call the overloaded startTrip method with 2 parameters (destination and passengers)
            // This demonstrates method overloading (same method name, different parameters)
            vehicle.startTrip("Dorm", 3);
        }
    }
}

/**
 * VehicleE02 - Base class representing a general vehicle
 * This class serves as the parent class for specialized vehicle types
 */
class VehicleE02 {
    // protected: accessible in this class and all subclasses
    // final: these fields cannot be modified after initialization (immutable)
    protected final String name;
    protected final int maxSpeed;

    /**
     * Constructor to initialize a vehicle with name and maximum speed
     * @param name - the vehicle's identifier
     * @param maxSpeed - maximum speed in km/h
     */
    VehicleE02(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Start a trip to a destination
     * This is the basic version that can be overridden by subclasses
     * @param destination - where the vehicle is heading
     */
    void startTrip(String destination) {
        System.out.println(name + " heading to " + destination + " at up to " + maxSpeed + " km/h.");
    }

    /**
     * Overloaded version of startTrip that includes passenger count
     * Method overloading: same method name, different parameters
     * This method calls the single-parameter version internally
     * @param destination - where the vehicle is heading
     * @param passengers - number of passengers on board
     */
    void startTrip(String destination, int passengers) { // overloaded
        System.out.println(name + " taking " + passengers + " passengers to " + destination + ".");
        
        // Call the single-parameter version of startTrip
        // If this is called on an ElectricVehicleE02 object, the overridden version will be invoked
        startTrip(destination);
    }
}

/**
 * ElectricVehicleE02 - Subclass of VehicleE02 representing an electric vehicle
 * Demonstrates inheritance, constructor chaining with super(), and method overriding
 */
class ElectricVehicleE02 extends VehicleE02 {
    // Additional field specific to electric vehicles
    // private: only accessible within this class (not in subclasses or other classes)
    private final int batteryPercent;

    /**
     * Constructor for ElectricVehicleE02
     * Uses super() to call the parent class constructor
     * @param name - the vehicle's identifier
     * @param maxSpeed - maximum speed in km/h
     * @param batteryPercent - current battery level (0-100)
     */
    ElectricVehicleE02(String name, int maxSpeed, int batteryPercent) {
        // super() must be the first statement in a subclass constructor
        // Calls the VehicleE02 constructor to initialize inherited fields
        super(name, maxSpeed);
        
        // Initialize the subclass-specific field
        this.batteryPercent = batteryPercent;
    }

    /**
     * Override the startTrip method to provide electric vehicle specific behavior
     * @Override annotation indicates this method overrides a parent class method
     * This customizes the output to include battery information
     * @param destination - where the vehicle is heading
     */
    @Override
    void startTrip(String destination) {
        // Custom implementation that shows battery percentage instead of max speed
        // The inherited 'name' field is accessible because it's protected
        System.out.println(name + " (EV) heading to " + destination + " with " + batteryPercent + "% battery.");
    }
    
    // NOTE: The overloaded startTrip(String, int) method is inherited and not overridden
    // When called on an ElectricVehicleE02 object, it will:
    // 1. Execute the inherited method body from VehicleE02
    // 2. Call startTrip(destination) which will use THIS overridden version (polymorphism)
}
