package Conexion;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientException;

public class Conexion {

    static MongoClient con = null;
    static private final String host = "127.0.0.1";
    static private final int port = 27017;

    public static MongoClient getConnection() {

        MongoClient mongo = null;

        try {
            mongo = new MongoClient(host, port);
        } catch (MongoClientException e) {
            System.out.println(e.getMessage());
        }
        return mongo;
    }
}
