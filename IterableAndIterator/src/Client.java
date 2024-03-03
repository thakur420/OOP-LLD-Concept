public class Client {
    public static void main(String[] args) {
        C obj = (C)new P();
        System.out.println(obj.d1);
        System.out.println(obj.d); // parent d (variable hiding)
        obj.fun1();
        obj.fun(); // child fun (method overridding)
        obj.sfun(); // parent sfun (method hiding)
    }
}
