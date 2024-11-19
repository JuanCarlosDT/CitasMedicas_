package Conexion;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class citaDB {

    MongoClient con = Conexion.getConnection();
    Gson gson = new Gson();

    MongoDatabase db = con.getDatabase("consultorio");
    MongoCollection<Document> col = db.getCollection("cita");
}
