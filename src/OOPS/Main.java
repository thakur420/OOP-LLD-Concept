package OOPS;

public class Main implements DefaultAndStaticMethod{
    public static void main(String[] args) {
        DefaultAndStaticMethod.staticMethod();
        Main main = new Main();
        main.defaultMethod();
        main.abstractMethod();

    }

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
