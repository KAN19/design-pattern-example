package singleton;

public class MultithreadDbConnection {
    private static MultithreadDbConnection instance = null;

    private MultithreadDbConnection() {
        System.out.println("DbConnection created");
    }

    public static MultithreadDbConnection getInstance() {
        if (instance == null) {
            synchronized (MultithreadDbConnection.class) {
                if (instance == null) {
                    instance = new MultithreadDbConnection();
                }
            }
        }
        return instance;
    }
}
