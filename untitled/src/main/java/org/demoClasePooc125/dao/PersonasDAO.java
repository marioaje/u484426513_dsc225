package org.demoClasePooc125.dao;


import org.demoClasePooc125.model.Personas;
import org.demoClasePooc125.misc.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {

//    public void metodos cud
    //public read

    public List<Personas> obtenerPersonas() {
        List<Personas> lista = new ArrayList<Personas>();

        String sql = "select * from personas";

        try {
            Connection con = Conexion.getConnection();
            Statement stmts = con.createStatement();
            ResultSet rs = stmts.executeQuery(sql);{
                while (rs.next()) {
                    Personas items = new Personas(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellidos"),
                            rs.getString("estado")
                    );
                    //en una lista
                    lista.add(items);
                }
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }



    public void insertarPersona(Personas itemPersona) {
        String sql = "INSERT INTO personas (nombre, apellidos, estado) VALUES (?, ?, ?)";
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement stmts = con.prepareStatement(sql);{
                stmts.setString(1, itemPersona.getNombre());
                stmts.setString(2, itemPersona.getApellidos());
                stmts.setString(3, itemPersona.getEstado());
            }
            stmts.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
