package W12;

/**
 * W12E01 - Extending W11 People Examples
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Build a multi-level inheritance chain (Person -> Student -> WorkingStudent)
 * - Demonstrate method overriding vs. method overloading
 * - Use polymorphic calls through a shared parent reference
 */
public class W12E01 {

    public static void main(String[] args) {
        // Create objects at different levels of the inheritance hierarchy
        PersonE01 base = new PersonE01("Amir");
        StudentE01 learner = new StudentE01("Bala", "Physics");
        WorkingStudentE01 hustler = new WorkingStudentE01("Chong", "CS", "Evening Barista");

        // Array declared with parent type (PersonE01)
        // Can hold references to parent and ALL descendants (polymorphic array)
        PersonE01[] people = { base, learner, hustler };
        
        // Polymorphic loop: same code calls different introduce() based on actual object type
        for (PersonE01 person : people) {
            // Calls overridden introduce() in the actual object's class
            // - PersonE01.introduce() for base
            // - StudentE01.introduce() for learner
            // - WorkingStudentE01.introduce() for hustler
            person.introduce();
            
            // Calls overloaded introduce(String prefix)
            // Same polymorphic dispatch applies: actual type's method is called
            person.introduce("(polymorphic call)");
        }
    }
}

// Base class: Parent in the inheritance hierarchy
// Protected allows subclasses to access 'name'
class PersonE01 {
    protected final String name;

    // Constructor: initializes the person's name
    PersonE01(String name) {
        this.name = name;
    }

    // Method 1: introduce() — basic version with no parameters
    void introduce() {
        System.out.println("Hello, I am " + name + ".");
    }

    // Method 2: introduce(String prefix) — OVERLOADED version
    // Same method name, different parameter list (method overloading)
    // Reuses the parameterless introduce() to avoid duplication
    void introduce(String prefix) {
        System.out.print(prefix + " ");
        introduce(); // calls the parameterless version
    }
}

// First-level subclass: Student inherits from Person
// Adds 'major' field on top of inherited 'name'
class StudentE01 extends PersonE01 {
    protected final String major;

    // Constructor: calls parent constructor via super() first
    // Then initializes the student-specific major field
    StudentE01(String name, String major) {
        super(name); // Initialize parent's name field
        this.major = major;
    }

    // OVERRIDES the parameterless introduce() from PersonE01
    // Method overriding: same signature, different implementation
    // At runtime, polymorphism uses THIS version when called on StudentE01 objects
    @Override
    void introduce() {
        System.out.println("Hello, I am " + name + " and I study " + major + ".");
    }
    
    // Note: introduce(String prefix) is inherited from PersonE01
    // It calls our overridden introduce() via polymorphism
}

// Second-level subclass: WorkingStudent inherits from Student (which inherits from Person)
// Multi-level inheritance chain: Person -> Student -> WorkingStudent
// Adds 'job' field on top of inherited 'name' and 'major' fields
class WorkingStudentE01 extends StudentE01 {
    private final String job;

    // Constructor: calls parent (StudentE01) constructor via super()
    // Parent then calls its parent (PersonE01) constructor
    // Chain ensures all ancestor fields are properly initialized
    WorkingStudentE01(String name, String major, String job) {
        super(name, major); // Initialize parent's fields (name, major)
        this.job = job;
    }

    // OVERRIDES the introduce() from StudentE01 (which itself overrode PersonE01's version)
    // Final override in the chain: provides the most specific implementation
    // At runtime, polymorphism uses THIS version when called on WorkingStudentE01 objects
    @Override
    void introduce() {
        System.out.println("Hi, I am " + name + ", a " + major + " student working as " + job + ".");
    }
}
