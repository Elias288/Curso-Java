package Practica.Ejercicio_hilos_Runnable.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiloFabrica {


    List ListaProductos = Arrays.asList("Smartphone","Tablet","Auriculares","Smartwatch","Parlante");

    public String producirRandom () {
        int productoRandom = (int) (Math.random() * (4));
        return (String) ListaProductos.get(productoRandom + 1);
    }


}
