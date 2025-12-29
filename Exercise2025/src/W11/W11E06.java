package W11;

/**
 * W11E06 - Protected vs Private Members
 *
 * LEARNING OBJECTIVES:
 * - Understand which members subclasses can access (protected)
 * - See that private members stay inside their own class
 * - Notice package access (default) in the same folder
 *
 * JOURNAL:
 * protected opens a method to children; private keeps it locked inside the class.
 * Package-private methods are visible within the same package (folder) only.
 */
public class W11E06 {

    public static void main(String[] args) {
        LaptopE06 laptop = new LaptopE06();
        laptop.boot();

        // laptop.powerOn(); // would compile here because we are in same package,
        // but in another package only boot() would be usable.
    }
}

class MachineE06 {
    protected void powerOn() {
        System.out.println("MachineE06: power on sequence");
    }

    private void hiddenCheck() {
        System.out.println("MachineE06: internal self-check");
    }

    void runSelfCheck() {
        hiddenCheck();
    }
}

class LaptopE06 extends MachineE06 {
    void boot() {
        powerOn();      // allowed because it is protected
        runSelfCheck(); // allowed because it is package-private helper
    //    hiddenCheck();  // not allowed because it is private
        System.out.println("LaptopE06: loading operating system");
    }
}
