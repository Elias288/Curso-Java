package Modulo_9_Concurrencia_y_multihilo;

class MiHilo extends Thread {
    @Override
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}

public class A_ejemplo_thread {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.start();
    }
}
