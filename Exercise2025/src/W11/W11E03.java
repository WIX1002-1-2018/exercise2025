package W11;

/**
 * W11E03 - Constructor Chaining with super()
 *
 * LEARNING OBJECTIVES:
 * - Call a parent constructor using super(...)
 * - See constructor order: parent runs before child
 * - Share common data setup between parent and child
 *
 * JOURNAL:
 * When building a subclass, the parent parts must be ready first.
 * Calling super(...) ensures the parent fields are initialized properly.
 */
public class W11E03 {

    public static void main(String[] args) {
        StudentE03 student = new StudentE03("Devi", 2025);
        student.showProfile();
    }
}

class PersonE03 {
    protected final String name;

    PersonE03(String name) {
        this.name = name;
        System.out.println("PersonE03 constructor runs for " + name);
    }
}

class StudentE03 extends PersonE03 {
    private final int intakeYear;

    StudentE03(String name, int intakeYear) {
        super(name); // calls PersonE03(String)
        this.intakeYear = intakeYear;
        System.out.println("StudentE03 constructor adds intake year.");
    }

    void showProfile() {
        System.out.println(name + " enrolled in " + intakeYear);
    }
}
