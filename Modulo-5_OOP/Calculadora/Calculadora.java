public class Calculadora {
    public static void main(String[] args) {
        // Como se declaró como una clase abstracta da error al instanciar la clase
        // Operacion op = new Operacion();
        Suma suma1 = new Suma();
        Resta resta1 = new Resta();
        Multiplicacion multiplicacion1 = new Multiplicacion();
        Division division1 = new Division();

        int resultado1 = suma1.calcular(5, 5);
        System.out.println(suma1.getValor1() + " " + suma1.getOperacion() + " " + suma1.getValor2() + " = "
                + resultado1);

        suma1.calcular(20, 7);
        suma1.mostrarCalculo();

        resta1.calcular(100, 69);
        resta1.mostrarCalculo();

        multiplicacion1.calcular(3, 5);
        multiplicacion1.mostrarCalculo();

        division1.calcular(50, 4);
        division1.mostrarCalculo();

        division1.calcular(34, 0);
        division1.mostrarCalculo();
    }
}
