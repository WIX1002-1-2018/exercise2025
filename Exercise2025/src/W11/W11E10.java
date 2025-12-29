package W11;

/**
 * W11E10 - Polymorphism with an Inheritance Chain
 *
 * LEARNING OBJECTIVES:
 * - Use an abstract base class to define common shape behavior
 * - Store different subclasses in a single parent array
 * - Observe dynamic dispatch when calling overridden methods
 *
 * JOURNAL:
 * Polymorphism lets us treat many specific shapes as one type (ShapeE10).
 * Each object keeps its own area() implementation, chosen at runtime.
 */
public class W11E10 {

    public static void main(String[] args) {
        ShapeE10[] shapes = {
            new CircleE10(2.5),
            new RectangleE10(4, 3),
            new TriangleE10(5, 2)
        };

        for (ShapeE10 shape : shapes) {
            System.out.println(shape.name() + " area = " + shape.area());
        }
    }
}

abstract class ShapeE10 {
    abstract double area();
    abstract String name();
}

class CircleE10 extends ShapeE10 {
    private final double radius;

    CircleE10(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    String name() {
        return "Circle";
    }
}

class RectangleE10 extends ShapeE10 {
    private final double width;
    private final double height;

    RectangleE10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    String name() {
        return "Rectangle";
    }
}

class TriangleE10 extends ShapeE10 {
    private final double base;
    private final double height;

    TriangleE10(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    String name() {
        return "Triangle";
    }
}
