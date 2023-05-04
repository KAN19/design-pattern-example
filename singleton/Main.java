package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

        exampleSerialization();
        
    }

    public static void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
        // LazyDbConnection dbConnection = LazyDbConnection.getInstance();
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        // objectOutputStream.writeObject(dbConnection);
        // objectOutputStream.close();
      

        // ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        // LazyDbConnection deserializedDbConnection = (LazyDbConnection) objectInputStream.readObject();
        // objectInputStream.close();

        // System.out.println("dbConnection == deserializedDbConnection: " + (dbConnection == deserializedDbConnection));
    
        SerializableSingleton dbConnection = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(dbConnection);
        objectOutputStream.close();
      

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializedDbConnection = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("dbConnection == deserializedDbConnection: " + (dbConnection == deserializedDbConnection));
    }
}
