package Practica.Ejercicio_practico_colecciones.src;

public class Estudiante {
    private int id; // Identificador único
    private String nombre;
    private Double promedio;

    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{id=" + id + ", nombre='" + nombre + "', promedio= " + promedio + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Estudiante))
            return false;
        Estudiante e = (Estudiante) o;
        return this.id == e.id;
    }

    public int hasCode() {
        return Integer.hashCode(id);
    }
}
