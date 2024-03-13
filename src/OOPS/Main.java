package OOPS;

public class Main{
    public static void main(String[] args) {
        // Concept1 -> Interface Default and Static Method
        DefaultAndStaticMethod.staticMethod();
        DefaultAndStaticMethodChild obj1 = new DefaultAndStaticMethodChild();
        obj1.abstractMethod();
        obj1.defaultMethod();

        // Concept2 -> Static Method Overriding vs hiding
        StaticMethodOverriding obj2 = new StaticMethodOverridingChild();
        obj2.staticMethod();
        obj2.nonStaticMethod();

        StaticMethodOverridingChild obj3 = new StaticMethodOverridingChild();
        obj3.staticMethod();
        obj3.nonStaticMethod();




    }


}
