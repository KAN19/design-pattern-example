package singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    
    public static SerializableSingleton instance = null; 

    private SerializableSingleton() {
        System.out.println("DbConnection created");
    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
    
}
