package Controller;

import Conexion.doctoresDB;
import com.google.gson.Gson;
import org.bson.Document;

public class doctorescontroller {

    Gson gson = new Gson();
    doctoresDB db = new doctoresDB();

    public boolean login(String f) {

        return db.Login(Document.parse(f));

    }

    public String NombUsuario(String correo) {
        return db.nombre(correo);
    }
}
