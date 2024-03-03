package Singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection2 databaseConnection2 = DatabaseConnection2.getInstance();
        System.out.println(databaseConnection2);
    }
}
