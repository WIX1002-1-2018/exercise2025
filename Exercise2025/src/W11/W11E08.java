package W11;

/**
 * W11E08 - Methods That Cannot Be Overridden
 *
 * LEARNING OBJECTIVES:
 * - Use final to prevent overriding a method
 * - See that access level (protected) does not change the final rule
 * - Call an inherited final method from a child
 *
 * JOURNAL:
 * final locks a method so subclasses must keep it as-is.
 * This is useful for safety rules or behaviors that must never change.
 */
public class W11E08 {

    public static void main(String[] args) {
        ChildRuleE08 child = new ChildRuleE08();
        child.followRule();
    }
}

class BaseRuleE08 {
    final protected void safetyRule() {
        System.out.println("BaseRuleE08: safety rule must be followed");
    }
}

class ChildRuleE08 extends BaseRuleE08 {
    void followRule() {
        safetyRule(); // inherited, cannot be changed
    }

    // @Override
    // void safetyRule() { } // Uncommenting this line would cause a compile error because the method is final.
}
