public class Caniche extends Perro {

    Caniche(String nuevoNombre, int nuevaEdad, String nuevoColor, String nuevaCaracteristica) {
        super(nuevoNombre, nuevaEdad, nuevoColor, nuevaCaracteristica);
        this.setSonido("chillar");
    }

    // Sobrescribe al función hacerSonido
    @Override
    void hacerSonido() {
        System.out.println(this.getNombre() + "= " + this.getSonido());
    }
}
