package AbstractFactory;

public class WInFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }

    @Override
    public DropDown createDropDown() {
        return new WinDropDown();
    }
}
