package PrototypeAndRegistry;

public class RegistryDemo {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        Shape shape1 = prototypeRegistry.get("GreenCircle");
        Shape shape2 = prototypeRegistry.get("BlueRectangle");
        Shape shape1Clone = shape1.clone();
        Shape shape2Clone = shape2.clone();
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape1Clone);
        System.out.println(shape2Clone);

    }
}
