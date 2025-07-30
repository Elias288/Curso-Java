package Modulo_5_OOP.Calculadora;

public class Division extends Operacion {
    @Override
    int calcular(int valor1, int valor2) {
        // super.calcular almacena los valores (valor1 y valor2)
        super.calcular(valor1, valor2);

        // Comprueba si el valor2 es mayor que 0
        if (valor2 == 0)
            return 0;

        // el objeto guarda como operación '/'
        this.setOperacion('/');

        int resultado = valor1 / valor2;
        this.setUltimoResultado(resultado);
        return resultado;
    }

    @Override
    public void mostrarCalculo() {
        int valor2 = this.getValor2();

        // Al mostrar el calculo se verifica si el valor2 es igual a 0 y en caso
        // afirmativo muestra el mensaje de error
        if (valor2 == 0) {
            System.out.println(this.getValor1() + " " + this.getOperacion() + " "
                    + this.getValor2() + " = "
                    + "Error (No se puede dividir por 0)");
            return;
        }

        System.out.println(this.getValor1() + " " + this.getOperacion() + " "
                + this.getValor2() + " = "
                + this.getUltimoResultado());
    }
}
