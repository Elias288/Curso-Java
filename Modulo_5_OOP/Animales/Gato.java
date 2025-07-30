package Modulo_5_OOP.Animales;

public class Gato extends Animal {

    Gato(String nuevoNombre, int nuevaEdad, String nuevoColor) {
        super(nuevoNombre, nuevaEdad, nuevoColor);

        // Define el sonido del gato por defecto
        super.setSonido("maullar");
    }

}
