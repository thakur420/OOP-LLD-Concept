package OOPS;

public interface DefaultAndStaticMethod {
    default void defaultMethod(){
//        They are designed to be overridden by implementing classes if needed.
//        The primary use case is to add new methods to existing interfaces without
//        breaking backward compatibility.
//        When a class implements an interface with a default method,
//        it can choose to override the default method or inherit it as is.
        System.out.println("Implementation of Default Method inside Interface");
    }
    static void staticMethod(){
//        They are not inherited by implementing classes.
//        Static methods in interfaces are meant to be utility methods that are
//        relevant to the interface but don't depend on instance-specific behavior.
//        They are invoked using the interface name and cannot be overridden by
//        implementing classes.
        System.out.println("Implementing Static Method inside Interface");
    }
    void abstractMethod();
}
