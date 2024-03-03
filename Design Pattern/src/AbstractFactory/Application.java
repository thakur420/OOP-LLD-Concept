package AbstractFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private DropDown dropDown;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckbox();
        this.dropDown = factory.createDropDown();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
        dropDown.paint();
    }
}
