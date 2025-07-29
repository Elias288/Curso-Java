public class Suma extends Operacion {
    @Override
    int calcular(int valor1, int valor2) {
        // super.calcular almacena los valores (valor1 y valor2)
        super.calcular(valor1, valor2);
        // el objeto guarda como operación '+'
        this.setOperacion('+');

        int resultado = valor1 + valor2;
        this.setUltimoResultado(resultado);
        return resultado;
    }
}
