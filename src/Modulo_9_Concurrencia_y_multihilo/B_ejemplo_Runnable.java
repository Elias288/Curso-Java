package Modulo_9_Concurrencia_y_multihilo;

class MiRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}

public class B_ejemplo_Runnable {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new MiRunnable());
        hilo1.start();
    }
}
