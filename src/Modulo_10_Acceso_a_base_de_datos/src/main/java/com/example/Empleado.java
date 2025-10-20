package com.example;

public class Empleado {
    public Integer id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String id_equipo;

    public Empleado(Integer id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.nombre + " | " + this.apellido + " | " + this.telefono;
    };
}
