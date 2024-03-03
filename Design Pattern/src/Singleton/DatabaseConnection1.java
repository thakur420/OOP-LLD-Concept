package Singleton;


// Performance  will be slow.
public class DatabaseConnection1 {
    // Early initialization .
     private static final DatabaseConnection1 instance =  new DatabaseConnection1();

    private DatabaseConnection1(){

    }

    public static DatabaseConnection1 getInstance() {
        return instance;
    }
}
