package org.demoClasePooc125.view;

import org.demoClasePooc125.controller.PersonasController;
import org.demoClasePooc125.model.Personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasView {
    //obtenerPersonas

    private static PersonasController controller = new PersonasController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertarPersona();
        obtenerPersonas();
    }


    private static void obtenerPersonas(){
        List<Personas> lista = controller.obtenerPersonas();

        for (Personas item : lista) {
            System.out.println("Id: " +item.getId() + " - Nombre: " + item.getNombre() + " - Apellido: " + item.getApellidos() + " - Estado: " + item.getEstado());
        }

    }


    private static void insertarPersona() {
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese el estado: ");
        String estado = scanner.nextLine();


        controller.insertarPersona(new Personas(nombre, apellidos, estado));
    }
}
