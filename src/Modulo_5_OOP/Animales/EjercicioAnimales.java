package Modulo_5_OOP.Animales;

public class EjercicioAnimales {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Animal", 1, "rojo");
        Perro animal2 = new Perro("juan", 5, "amarillo", "rompebolas");
        Gato animal3 = new Gato("mishi", 3, "blanco");
        Caniche animal4 = new Caniche("Kiki", 5, "negro", "Pequeño");

        System.out.println("Sonidos de los animales");
        animal1.hacerSonido();
        animal2.hacerSonido();
        animal3.hacerSonido();
        animal4.hacerSonido();

        System.out.println("\nCaracterísticas de los perros:");
        System.out.println("- " + animal2.getNombre() + ": " + animal2.getCaracteristica());
        System.out.println("- " + animal4.getNombre() + ": " + animal4.getCaracteristica());
    }
}