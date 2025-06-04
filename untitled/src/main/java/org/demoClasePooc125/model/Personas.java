package org.demoClasePooc125.model;

public class Personas {
    private int id;
    private String nombre;
    private String apellidos;
    private String estado;

    public Personas(int id, String nombre, String apellidos, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
    }

    public Personas( String nombre, String apellidos, String estado) {
        this(0,nombre,apellidos,estado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
