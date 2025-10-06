package Practica.Ejercicio_hilos_Runnable.src;

import java.util.Scanner;

public class Main {

    public static void mostrarMenu() {
        System.out.println("--------------------- Ejercicio Threads Runnable ---------------------");
        System.out.println("Selecciona ejercicio: ");
        System.out.println("1)\tCarrearas de autos");
        System.out.println("2)\tRecolector-Vendedor");
        System.out.println("3)\tRelojes independientes");
        System.out.println("0)\tSalir");
        System.out.print("> ");
    }

    public static void CarreraDeAutos() {
        System.out.println("Carrera de autos");
        /*
         * Imaginando una carrera de autos. Cada auto es un hilo que vanza una distancia aleatoria
         * el que llega primero a la meta gana.
         * Se debe mostrar en tiempo real la carrera.
         * Math.random()
         */


        Thread Auto1 = new Thread(new AutoHilo("ROJO"));
        Thread Auto2 = new Thread(new AutoHilo("AZUL"));

        Auto1.start();
        Auto2.start();
        System.out.println("\n");


        try {
            Auto1.join();
            Auto2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void FabricaComercio() {
        System.out.println("Fabrica-comercio");
        /*
         * Implementar una cola de productos, donde hay un hilo "Fabrica" que agrega
         * productos a la lista y un hilo "Comercio" que retiran productos para vender.
         * Si la cola está llena de productos, la fabrica no puede producir más y si
         * está vacia el comercio
         * no puede vender.
         */
    }

    public static void RelojesIndependientes() {
        System.out.println("Relojes independientes");
        /*
         * Crear una clase que implemente Runnables que permita imprimir en consola la hora actual cada segundo.
         * Utilizando sleep() y LocalTime.now()
         *
         */
    }

    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    CarreraDeAutos();
                    break;
                case 2:
                    FabricaComercio();
                    break;
                case 3:
                    RelojesIndependientes();
                    break;

                default:
                    System.out.println("Error, la opción no existe");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}