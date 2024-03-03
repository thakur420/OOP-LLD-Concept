package FactoryPattern;

public class Demo {
    public static void main(String[] args) {
       Dialog dialog = new WindowsDialog();
       dialog.renderWindow();

       Dialog dialog1 = new WebDialog();
       dialog1.renderWindow();
    }
}
