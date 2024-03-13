package OOPS;

public class DefaultAndStaticMethodChild implements DefaultAndStaticMethod{
    @Override
    public void defaultMethod() {
//        DefaultAndStaticMethod.super.defaultMethod();
        System.out.println("My Implementation of Default Method");
    }

    @Override
    public void abstractMethod() {
        System.out.println("My Implementation of abstract Method");
    }
}
