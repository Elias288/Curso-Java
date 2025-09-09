package Modulo_9_Concurrencia_y_multihilo;

class Semaforo {
    private boolean verde = false;

    public synchronized void esperarLuzVerde() throws InterruptedException {
        while (!verde) {
            wait(); // espera hasta que cambie a verde
        }
        System.out.println("¡Luz verde! Avanzando...");
    }

    public synchronized void ponerEnVerde() {
        verde = true;
        notify(); // despierta a un hilo que esté esperando
    }
}

public class E_ejemplo_semaforo {
    public static void main(String[] args) throws InterruptedException {
        Semaforo semaforo = new Semaforo();

        Thread auto = new Thread(() -> {
            try {
                semaforo.esperarLuzVerde();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Auto llega al semáforo...");
        auto.start();

        Thread.sleep(3000); // simula semáforo en rojo
        System.out.println("Cambiando a verde...");
        semaforo.ponerEnVerde();
    }
}
