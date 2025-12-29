package W11;

/**
 * W11E04 - Overriding a Method
 *
 * LEARNING OBJECTIVES:
 * - Override a parent method in a subclass
 * - Observe dynamic dispatch (child version runs even when referenced as parent)
 * - Use @Override to avoid mistakes
 *
 * JOURNAL:
 * Overriding lets the child replace a shared method with a more specific version.
 * Java chooses the most specific implementation at runtime.
 */
public class W11E04 {

    public static void main(String[] args) {
        PersonE04 person = new PersonE04("Elaine");
        PersonE04 studentAsPerson = new StudentE04("Farid", "Mathematics");

        person.describe();           // calls PersonE04 version
        studentAsPerson.describe();  // calls StudentE04 version because of overriding
    }
}

class PersonE04 {
    protected final String name;

    PersonE04(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println("Person: " + name);
    }
}

class StudentE04 extends PersonE04 {
    private final String major;

    StudentE04(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    void describe() {
        System.out.println("Student: " + name + " (" + major + ")");
    }
}
