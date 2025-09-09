package Modulo_9_Concurrencia_y_multihilo;

public class C_ejemplo_concurrencia_multihilo {
    public static void main(String[] args) {

        Runnable tareaPeriodica = () -> {
            try {
                while (true) {
                    System.out.println("Mensaje periódico: " + System.currentTimeMillis() + " - Hilo: "
                            + Thread.currentThread().getName());
                    Thread.sleep(1000); // espera 2 segundos
                }
            } catch (Exception e) {
                System.out.println("Hilo interrumpido");
            }
            ;
        };

        Thread hilo = new Thread(tareaPeriodica);
        hilo.start();
    }
}
