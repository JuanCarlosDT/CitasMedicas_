package Conexion;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class doctoresDB {

    MongoClient con = Conexion.getConnection();
    Gson gson = new Gson();

    MongoDatabase db = con.getDatabase("consultorio");
    MongoCollection<Document> col = db.getCollection("doctores");

    public boolean Login(Document f) {
        List<Document> match = col.find(f).into(new ArrayList<Document>());

        return !match.isEmpty();
    }

    public List<Document> findpacientes(Document f) {
        return col.find(f).into(new ArrayList<Document>());
    }

    public String nombre(String correo) {

        Document document = col.find(Filters.eq("correo", correo)).first();
        String nombre = document.getString("nombre");
        return nombre;
    }
}
