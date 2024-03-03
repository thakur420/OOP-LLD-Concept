public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        for (int i : node1) {
            System.out.println(i);
        }
        String str = "Hello";
        //str[2] = 'z'; compilation error
    }
}