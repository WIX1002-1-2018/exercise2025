package W11;

/**
 * W11E09 - Working with Object Class Methods
 *
 * LEARNING OBJECTIVES:
 * - Override toString() for readable output
 * - Override equals() and hashCode() for logical comparison
 * - Understand that every class implicitly extends Object
 *
 * JOURNAL:
 * Object is the root of all classes. Overriding its methods improves how
 * our objects print and compare. equals() should pair with hashCode().
 */
public class W11E09 {

    public static void main(String[] args) {
        StudentCardE09 card1 = new StudentCardE09("S123", "Hana");
        StudentCardE09 card2 = new StudentCardE09("S123", "Hana");
        StudentCardE09 card3 = new StudentCardE09("S999", "Imran");

        System.out.println(card1); // uses overridden toString()
        System.out.println("card1 equals card2? " + card1.equals(card2));
        System.out.println("card1 equals card3? " + card1.equals(card3));
    }
}

class StudentCardE09 {
    private final String id;
    private final String name;

    StudentCardE09(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentCard[id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudentCardE09 other)) {
            return false;
        }
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
