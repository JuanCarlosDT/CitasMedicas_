package citasmedicas;

import Conexion.Conexion;
import Login.*;

public class CItasMedicas {

    public static String nombreUsuario;

    public static void main(String[] args) {

        Conexion con = new Conexion();
        FrmLogin lg = new FrmLogin();

        lg.setVisible(true);

    }
}
