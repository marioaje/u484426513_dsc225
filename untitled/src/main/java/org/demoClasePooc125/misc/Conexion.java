package org.demoClasePooc125.misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Los atributos??? //invocan las variables desde github
    private static final String URL = "jdbc:mysql://srv863.hstgr.io:3306/u484426513_dsc225";
    private static final String USER = "1u484426513_dsc225";
    private static final String PASSWORD = "/Nv0[f7U";
//    la clave : /Nv0[f7U
//            u484426513_dsc225
//    srv863.hstgr.io o puede usar esta IP como tu nombre de host: 45.88.196.5

    //Aca ocupamos una funcion de acceso publico
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos" + e.getMessage() );
            return null;
        }
    }

//    public static void main(String[] args) {
//        Connection con = getConnection();
//        if (con != null) {
//            System.out.println("Conectado com sucesso");
//            try{
//                con.close();
//            } catch (SQLException e) {
//                System.out.println("Error al cerrar con la base de datos" + e.getMessage() );
//            }
//        }
//        else {
//            System.out.println("Error al conectar con la base de datos");
//        }
//    }
}
