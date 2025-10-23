package Practica.Ejercicio_hilos_Runnable.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class Fabrica_Comercio implements Runnable {
    public final int cantidadProductos = 3;
    public String tipo;
    public List ListaProductos = new ArrayList<String>();



    public Fabrica_Comercio(String tipo) {
        this.tipo = tipo;
    }





    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i <= 10; i++) {
            try {
                if (Objects.equals(tipo, "Fabrica")){
                    while (ListaProductos.size() >= cantidadProductos){
                        System.out.println("fabrica esprando");
                        wait();
                    }

                   ListaProductos.add(new HiloFabrica().producirRandom());
                    System.out.println("Fabrica Producion");
                    notify();
                    Thread.sleep(300);

                }

                if (Objects.equals(tipo, "Comercio")) {
                    while (ListaProductos.size() == 0){
                        System.out.println("Comercio esperando");
                        wait();
                    }

                    ListaProductos.remove(0);
                    System.out.println("Comercio consumio");
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
