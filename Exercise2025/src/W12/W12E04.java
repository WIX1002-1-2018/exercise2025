package W12;

/**
 * W12E04 - Using super for Extended Behavior
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Override a method while still reusing parent logic via super
 * - Overload a calculation method to accept multiple inputs
 * - Show polymorphism when calling calculatePay()
 */
public class W12E04 {

    public static void main(String[] args) {
        // Create a regular employee with name and hourly rate
        EmployeeE04 staff = new EmployeeE04("Dan", 25.0);
        // Create a manager (subclass) with name, hourly rate, and weekly allowance
        ManagerE04 boss = new ManagerE04("Elya", 25.0, 200.0);

        // Polymorphism: store different employee types in parent class array
        EmployeeE04[] payroll = { staff, boss };
        
        // Process payroll: runtime polymorphism calls correct calculatePay()
        for (EmployeeE04 e : payroll) {
            double pay = e.calculatePay(40);
            System.out.println(e.getNameTag() + " weekly pay: " + pay);
        }
    }
}

// Base class representing a regular employee
class EmployeeE04 {
    private final String name;
    private final double rate;

    EmployeeE04(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    // Calculate pay based on hours worked
    double calculatePay(int hours) {
        return hours * rate;
    }

    // Overloaded version: includes a bonus parameter
    // Demonstrates method overloading: same name, different parameters
    double calculatePay(int hours, double bonus) {
        return calculatePay(hours) + bonus;
    }

    // Generate name tag for the employee
    String getNameTag() {
        return "Employee " + name;
    }
}

// Subclass representing a manager
// Demonstrates using super to EXTEND parent behavior
class ManagerE04 extends EmployeeE04 {
    private final double allowance;

    ManagerE04(String name, double rate, double allowance) {
        // super() calls parent constructor to initialize name and rate
        super(name, rate);
        this.allowance = allowance;
    }

    // OVERRIDES calculatePay to add allowance on top of base pay
    // Uses super.calculatePay() to reuse parent logic, then extends it
    @Override
    double calculatePay(int hours) {
        return super.calculatePay(hours) + allowance;
    }

    // OVERRIDES getNameTag to prepend "Manager" title
    // Uses super.getNameTag() to reuse parent logic
    @Override
    String getNameTag() {
        return "Manager " + super.getNameTag();
    }
}
