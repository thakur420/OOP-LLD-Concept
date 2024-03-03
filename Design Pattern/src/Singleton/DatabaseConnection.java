package Singleton;

// This implementation is not Thread safe.
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private String url;
    private int port;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance() {
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
