package AbstractFactory;

public class WinDropDown implements DropDown{
    @Override
    public void paint() {
        System.out.println("You have created WindowsOSDropDown.");
    }
}
