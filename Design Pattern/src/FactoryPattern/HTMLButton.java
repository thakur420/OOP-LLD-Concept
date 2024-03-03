package FactoryPattern;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>HTML Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! HTML Button says - 'Hello World!'");
    }
}
