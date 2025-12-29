package W11;

/**
 * W11E01 - Introduction to Classes
 *
 * LEARNING OBJECTIVES:
 * - Declare a simple class with fields and methods
 * - Create objects using a constructor
 * - Call an instance method to produce output
 *
 * JOURNAL:
 * A class is a blueprint; objects are the real things created from it.
 * Here we store a name and age, then ask each object to introduce itself.
 */
public class W11E01 {

    public static void main(String[] args) {
        SimplePersonE01 first = new SimplePersonE01("Aisyah", 19);
        SimplePersonE01 second = new SimplePersonE01("Ben", 21);

        first.introduce();
        second.introduce();
    }
}

class SimplePersonE01 {
    private final String name;
    private final int age;

    SimplePersonE01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}
