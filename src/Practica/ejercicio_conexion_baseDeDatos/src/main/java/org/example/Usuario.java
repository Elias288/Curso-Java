package org.example;

public class Usuario {
    private Integer id;
    private String nombre = "";
    private String contrasenia = "";
    private String rol = "";

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean validarUsuario(String contraseña) {
        if (this.contrasenia.equals(contraseña)) {
            return true;
        }


        return false;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.nombre + " | " + this.rol;
    }

    public Usuario(String nombre, String contrasenia, String rol, Integer id) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.id = id;
    }
}
