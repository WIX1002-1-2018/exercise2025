package W11;

/**
 * W11E07 - Comparing Access Modifiers
 *
 * LEARNING OBJECTIVES:
 * - Compare public, protected, and private methods
 * - Understand where each modifier can be accessed
 * - Recognize that private is only for the declaring class
 *
 * JOURNAL:
 * public is open everywhere, protected is for subclasses (and same package),
 * private is for the class itself. Use the smallest scope that still works.
 */
public class W11E07 {

    public static void main(String[] args) {
        SmartVaultE07 vault = new SmartVaultE07();
        vault.open();     // public: always available
        vault.audit();    // protected: visible here because same package
        // vault.resetCode(); // private: only VaultE07 itself can call this
    }
}

class VaultE07 {
    public void open() {
        System.out.println("VaultE07: door opened");
    }

    protected void audit() {
        System.out.println("VaultE07: audit trail recorded");
    }

    private void resetCode() {
        System.out.println("VaultE07: master code reset");
    }

    void maintenance() {
        resetCode();
    }
}

class SmartVaultE07 extends VaultE07 {
    public void enableFaceId() {
        System.out.println("SmartVaultE07: face recognition enabled");
    }
}
