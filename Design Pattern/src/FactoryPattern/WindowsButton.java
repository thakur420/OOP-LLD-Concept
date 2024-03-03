package FactoryPattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Windows Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
