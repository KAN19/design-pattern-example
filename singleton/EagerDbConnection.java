package singleton;

public class EagerDbConnection {
    public static EagerDbConnection instance = new EagerDbConnection();

    private EagerDbConnection() {
        System.out.println("DbConnection created");
    }

    public static EagerDbConnection getInstance() {
        return instance;
    }
}
