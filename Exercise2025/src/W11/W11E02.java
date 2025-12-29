package W11;

/**
 * W11E02 - First Inheritance Example
 *
 * LEARNING OBJECTIVES:
 * - Use the keyword extends to create a child class
 * - Reuse parent methods without rewriting them
 * - Understand the role of protected fields for subclasses
 *
 * JOURNAL:
 * Inheritance lets a child class start with everything the parent already has.
 * The child can add its own behavior while keeping the parent's abilities.
 */
public class W11E02 {

    public static void main(String[] args) {
        StudentE02 student = new StudentE02("Chong", "Computer Science");
        student.sayHello();          // inherited from PersonE02
        student.shareMajor();        // defined in StudentE02
    }
}

class PersonE02 {
    protected final String name;

    PersonE02(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, I'm " + name + ".");
    }
}

class StudentE02 extends PersonE02 {
    private final String major;

    StudentE02(String name, String major) {
        super(name);
        this.major = major;
    }

    void shareMajor() {
        System.out.println("I study " + major + ".");
    }
}
