public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread A = new Thread(foo);
        Thread B = new Thread(foo);
        Thread C = new Thread(foo);
        A.setName("A");
        B.setName("B");
        C.setName("C");
        A.start();
        B.start();;
        C.start();
    }
}