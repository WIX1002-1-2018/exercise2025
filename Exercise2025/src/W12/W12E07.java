package W12;

/**
 * W12E07 - Polymorphic Messaging
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Store heterogeneous objects in a single list
 * - Use overriding to specialize a shared send() method
 * - Overload send() to attach optional metadata
 */
public class W12E07 {

    public static void main(String[] args) {
        // Create array of different notifier types (polymorphic storage)
        NotifierE07[] notifications = {
                new EmailNotifierE07(),
                new SmsNotifierE07()
        };

        // Send notifications through different channels using polymorphism
        for (NotifierE07 notifier : notifications) {
            // Call single-parameter send() - uses overridden version
            notifier.send("Class starts at 9am");
            // Call overloaded send(String, String) with tag parameter
            notifier.send("Class starts at 9am", "Urgent");
        }
    }
}

// Base class for notification services
class NotifierE07 {
    // Basic send method - can be overridden by subclasses
    void send(String message) {
        System.out.println("Base notifier: " + message);
    }

    // Overloaded version: accepts message with a tag
    // Demonstrates method overloading: same name, different parameters
    void send(String message, String tag) {
        // Prepend tag and call the single-parameter send()
        // If called on subclass, the overridden send() will be used (polymorphism)
        send("[" + tag + "] " + message);
    }
}

// Concrete subclass for email notifications
class EmailNotifierE07 extends NotifierE07 {
    // OVERRIDES send() to provide email-specific behavior
    @Override
    void send(String message) {
        System.out.println("Email -> " + message);
    }
}

// Concrete subclass for SMS notifications
class SmsNotifierE07 extends NotifierE07 {
    // OVERRIDES send() to provide SMS-specific behavior
    @Override
    void send(String message) {
        System.out.println("SMS -> " + message);
    }
}
