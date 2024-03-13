package OOPS;

public class StaticMethodOverridingChild extends StaticMethodOverriding{
    static void staticMethod(){
        System.out.println("Calling Child Static Method ...");
    }
    void nonStaticMethod(){
        System.out.println("Calling Child nonStatic Method");
    }
}
