package org.demoClasePooc125.controller;

import org.demoClasePooc125.dao.PersonasDAO;
import org.demoClasePooc125.model.Personas;

import java.util.List;

public class UsuarioController {

    private PersonasDAO personasDAO = new PersonasDAO();

    //obtenerPersonas
    public List<Personas> obtenerPersonas() {
        return personasDAO.obtenerPersonas();
    }

    public void insertarPersona(Personas itemPersona) {
        personasDAO.insertarPersona(itemPersona);
    }
}
