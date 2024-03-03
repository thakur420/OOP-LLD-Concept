package AbstractFactory;

public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app ;
        GUIFactory factory;
        String osName = System.getProperty("os.name");
        System.out.println("OS Name => " + osName);
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WInFactory();
        }
        app = new Application(factory);
        return app;
    }
}
