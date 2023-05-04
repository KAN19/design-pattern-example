package singleton;

import java.io.Serializable;

/**
 * DbConnection
 */
public class LazyDbConnection implements Serializable {

    public static LazyDbConnection instance = null; 

    private LazyDbConnection() {
        System.out.println("DbConnection created");
    }

    public static LazyDbConnection getInstance() {
        if (instance == null) {
            instance = new LazyDbConnection();
        }
        return instance;
    }
    
}