package Singleton;

//Double checking with lock
public class DatabaseConnection2 {
    private static DatabaseConnection2 instance;

    private DatabaseConnection2(){

    }

    public static DatabaseConnection2 getInstance() {
        if (instance == null){
            synchronized (DatabaseConnection2.class){
                if(instance == null){
                  instance = new DatabaseConnection2();
                }
            }
        }
        return instance;
    }
}
