package W12;

/**
 * W12E06 - Abstract Classes and Polymorphic Loading
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Define an abstract base class with a template method
 * - Override hook methods in subclasses
 * - Overload a method to support optional parameters
 */
public class W12E06 {

    public static void main(String[] args) {
        // Create array of different resource types (polymorphic storage)
        ResourceE06[] resources = {
                new TextResourceE06("Lecture Notes"),
                new VideoResourceE06("Recorded Lab")
        };

        // Process each resource: polymorphism calls correct load() method
        for (ResourceE06 resource : resources) {
            // Call single-parameter load() - uses overridden version
            resource.load();
            // Call overloaded load(String) with custom source parameter
            resource.load("Offline Cache");
        }
    }
}

// Abstract base class for learning resources
// Abstract classes can have concrete methods (like load()) and abstract methods
abstract class ResourceE06 {
    private final String title;

    ResourceE06(String title) {
        this.title = title;
    }

    // Concrete method that can be overridden by subclasses
    void load() {
        System.out.println("Loading " + title + " from default source.");
    }

    // Overloaded version: accepts custom source parameter
    // Demonstrates method overloading: same name, different parameters
    void load(String source) {
        System.out.println("Loading " + title + " from " + source + ".");
    }
}

// Concrete subclass for text resources
class TextResourceE06 extends ResourceE06 {
    TextResourceE06(String title) {
        // Call parent constructor to initialize title
        super(title);
    }

    // OVERRIDES load() to add text-specific behavior before calling parent
    // Uses super.load() to extend parent behavior
    @Override
    void load() {
        System.out.println("Downloading text for " + getClass().getSimpleName());
        super.load();  // Call parent's load() method
    }
}

// Concrete subclass for video resources
class VideoResourceE06 extends ResourceE06 {
    VideoResourceE06(String title) {
        // Call parent constructor to initialize title
        super(title);
    }

    // OVERRIDES load() to add video-specific behavior before calling parent
    // Uses super.load() to extend parent behavior
    @Override
    void load() {
        System.out.println("Buffering video content for " + getClass().getSimpleName());
        super.load();  // Call parent's load() method
    }
}
