package org.example;

public class Tareas {
    private Integer id;
    private String estado;
    private String titulo;
    private String descripcion;
    private Integer id_usuario;

    public Tareas(Integer id, String estado, String titulo, String descripcion, Integer id_usuario) {
        this.id = id;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.estado + " | " + this.titulo + " | " + this.descripcion + " | " + this.id_usuario;
    }
}
