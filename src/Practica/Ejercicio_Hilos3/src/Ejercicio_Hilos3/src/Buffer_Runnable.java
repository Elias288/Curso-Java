package Ejercicio_Hilos3.src;

import java.util.Objects;

public class Buffer_Runnable implements Runnable {
    public int valor = 0;
    public boolean disponibilidad = false;
    public String tipo;

    public Buffer_Runnable(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                try {
                    if (Objects.equals(tipo, "productor")) {
                        while (this.valor != 0) {
                            System.out.println("productor espera");
                            wait();

                        }
                        disponibilidad = true;
                        this.valor = 1;
                        System.out.println("producir " + valor);
                        notify();
                        Thread.sleep(300);


                    } else {
                        while (this.valor == 0) {
                            System.out.println("consumidor espera");

                            wait();

                        }
                        System.out.println("consumir " + valor);
                        this.valor = 0;
                        disponibilidad = false;

                        notify();
                        Thread.sleep(300);
                    }


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }

        }
    }
}
