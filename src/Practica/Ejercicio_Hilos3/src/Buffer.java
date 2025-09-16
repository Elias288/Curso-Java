public class Buffer {
    public int valor = 0;
    public boolean disponibilidad = false;

    public synchronized void producir(int valor) {
        try {
            while (this.valor != 0) {
                System.out.println("productor espera");
                wait();

            }
            disponibilidad = true;
            this.valor = valor;
            System.out.println("producir " + valor);
            notify();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void consumir() {

        try {
            while (this.valor == 0) {
                System.out.println("consumidor espera");

                wait();

            }
            System.out.println("consumir " + valor);
            this.valor = 0;
            disponibilidad = false;

            notify();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
