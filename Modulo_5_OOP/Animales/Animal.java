package Modulo_5_OOP.Animales;

public class Animal {
    private String nombre;
    private int edad;
    private String color;
    private String sonido;

    /**
     * Para no tener que utilizar los setters al definir un objeto nuevo de
     * esta clase se define un constructor con el que setear los datos iniciales.
     */
    Animal(String nuevoNombre, int nuevaEdad, String nuevoColor) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
        this.color = nuevoColor;

        // Define el sonido de animal por defecto
        this.setSonido("Sonido de animal");
    }

    /* Métodos del animal */
    void hacerSonido() {
        System.out.println(this.nombre + ": " + this.sonido);
    }

    /* Get y Set de la propiedad nombre */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    /* Get y Set de la propiedad edad */
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    /* Get y Set de la propiedad color */
    public String getColor() {
        return this.color;
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    /* Get y Set de la propiedad sonido */
    protected String getSonido() {
        return this.sonido;
    }

    protected void setSonido(String nuevoSonido) {
        this.sonido = nuevoSonido;
    }

}