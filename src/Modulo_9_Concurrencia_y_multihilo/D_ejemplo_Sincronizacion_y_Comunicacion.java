package Modulo_9_Concurrencia_y_multihilo;

class Contador {
    private int valor = 0;

    // Método sincronizado
    public synchronized void incrementarSincronizado() {
        this.valor++;
    }

    // Bloque sincronizado
    public void incrementarBloqueSincronizado() {
        synchronized (this) {
            this.valor++;
        }
    }

    // incrementar no sincrinizado
    public void incrementarNoSincronizado() {
        this.valor++;
    }

    public int getValor() {
        return valor;
    }
}

public class D_ejemplo_Sincronizacion_y_Comunicacion {

    public static void noSincronizado() {
        Contador contador = new Contador();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarNoSincronizado();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarNoSincronizado();
        });

        t1.start();
        t2.start();

        try {
            // espera a que todos los hilos finalicen para continuar
            t1.join();
            t2.join();

            System.out.println("Valor final: " + contador.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void Sincronizado() {
        Contador contador = new Contador();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarSincronizado();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarSincronizado();
        });

        t1.start();
        t2.start();

        try {
            // espera a que todos los hilos finalicen para continuar
            t1.join();
            t2.join();

            System.out.println("Valor final: " + contador.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void BloqueSincronizado() {
        Contador contador = new Contador();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarBloqueSincronizado();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                contador.incrementarBloqueSincronizado();
        });

        t1.start();
        t2.start();

        try {
            // espera a que todos los hilos finalicen para continuar
            t1.join();
            t2.join();

            System.out.println("Valor final: " + contador.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        noSincronizado();
        // Sincronizado();
        // BloqueSincronizado();
    }
}