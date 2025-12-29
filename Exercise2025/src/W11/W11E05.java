package W11;

/**
 * W11E05 - Extending Behavior with super.method()
 *
 * LEARNING OBJECTIVES:
 * - Call the parent version from within an overridden method
 * - Add extra lines before/after the parent behavior
 * - Keep shared output while customizing details
 *
 * JOURNAL:
 * Overriding does not have to discard the parent logic.
 * We can extend it by calling super.method() and then adding more.
 */
public class W11E05 {

    public static void main(String[] args) {
        StudentE05 student = new StudentE05("Gita", "Physics", 3.8);
        student.describe();
    }
}

class PersonE05 {
    protected final String name;

    PersonE05(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println("Name: " + name);
    }
}

class StudentE05 extends PersonE05 {
    private final String major;
    private final double cgpa;

    StudentE05(String name, String major, double cgpa) {
        super(name);
        this.major = major;
        this.cgpa = cgpa;
    }

    @Override
    void describe() {
        super.describe(); // keep the parent's output
        System.out.println("Major: " + major);
        System.out.println("CGPA : " + cgpa);
    }
}
