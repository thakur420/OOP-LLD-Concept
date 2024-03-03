package AbstractFactory;

public class MacDropDown implements DropDown{
    @Override
    public void paint() {
        System.out.println("You have created WindowsOSDropDown.");
    }
}
