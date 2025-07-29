public class Perro extends Animal {
    private String característica;

    Perro(String nuevoNombre, int nuevaEdad, String nuevoColor, String nuevaCaracteristica) {
        super(nuevoNombre, nuevaEdad, nuevoColor);
        this.característica = nuevaCaracteristica;

        // Define el sonido del perro por defecto
        super.setSonido("Ladrar");
    }

    /* Get y Set de la propiedad características */
    public String getCaracteristica() {
        return this.característica;
    }

    public void setCaracteristica(String nuevaCaracteristica) {
        this.característica = nuevaCaracteristica;
    }

}