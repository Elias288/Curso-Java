public class Buffer {
    public int valor = 0;
    public boolean disponibilidad = false;

    public synchronized void producir (int valor) {
        try {
            if (this.valor != 0) {
                System.out.println("productor espera");
                wait();

            }else {
                disponibilidad = true;
                this.valor = valor;
                System.out.println("producir " + valor);
                notify();
            }
        } catch (InterruptedException e) {
             throw new RuntimeException(e);
        }
}

    public synchronized void consumir () {

            try {
                if (this.valor == 0) {
                System.out.println("consumidor espera");

                wait();

        } else {
                    System.out.println("consumir " + valor);
            this.valor = 0;
            disponibilidad = false;

            notify();
        }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

}
