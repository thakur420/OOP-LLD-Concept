package AbstractFactory;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
