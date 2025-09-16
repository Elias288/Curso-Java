import Ejercicio_Hilos3.src.Buffer_Runnable;

public class Main {
    public static void ejecucion1() {
        Buffer buffer = new Buffer();

        Runnable producir = () -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    buffer.producir(i);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable consumir = () -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    buffer.consumir();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread productor = new Thread(producir);
        Thread consumidor = new Thread(consumir);

        productor.start();
        consumidor.start();

        try {
            productor.join();
            consumidor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void ejecucion2() {
        Thread buffer_consu = new Thread(new Buffer_Runnable("consumidor"));
        Thread buffer_produ = new Thread(new Buffer_Runnable("productor"));

        buffer_produ.start();
        buffer_consu.start();

    }

    public static void main(String[] args) {
        //ej 4 productor - consumidor
        //ejecucion1();
        ejecucion2();


    }


}