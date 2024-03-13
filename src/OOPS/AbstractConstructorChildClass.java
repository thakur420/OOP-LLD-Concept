package OOPS;

public class AbstractConstructorChildClass extends AbstractConstructor{

    public AbstractConstructorChildClass(int x) {
        // parent class is abstract and have default constructor,
        // default constructor is not automatically called.
        // without 'super(x)' code will not compile.
        super(x);
    }
}
