package Controller;

import Conexion.pacientesDB;
import com.google.gson.Gson;
import org.bson.Document;

public class pacientescontroller {

    Gson gson = new Gson();
    pacientesDB db = new pacientesDB();

    public boolean login(String f) {

        return db.Login(Document.parse(f));

    }

    public String NombUsuario(String correo) {
        return db.nombre(correo);
    }

}
