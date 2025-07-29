public abstract class Operacion {
    private int valor1;
    private int valor2;
    private char operacion;
    private int ultimoResultado;

    int calcular(int valor1, int valor2) {
        this.setValor1(valor1);
        this.setValor2(valor2);
        return 0;
    }

    public void mostrarCalculo() {
        System.out.println(this.getValor1() + " " + this.getOperacion() + " "
                + this.getValor2() + " = "
                + this.getUltimoResultado());
    }

    public void setValor1(int nuevoValor) {
        this.valor1 = nuevoValor;
    }

    public int getValor1() {
        return this.valor1;
    }

    public void setValor2(int nuevoValor) {
        this.valor2 = nuevoValor;
    }

    public int getValor2() {
        return this.valor2;
    }

    protected void setUltimoResultado(int resultado) {
        this.ultimoResultado = resultado;
    }

    public int getUltimoResultado() {
        return this.ultimoResultado;
    }

    public char getOperacion() {
        return this.operacion;
    }

    protected void setOperacion(char operacion) {
        this.operacion = operacion;
    }
}
