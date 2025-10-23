package Practica.Ejercicio_hilos_Runnable.src;

import java.sql.SQLOutput;

public class AutoHilo implements Runnable {
    private int distanciaRandom = 0;
    private final String color;
    private final int meta = 10;
    public static boolean ganador = false;
    public static final Object finalizar = new Object();


    public AutoHilo(String color) {
        this.color = color;

    }

    public int getDistanciaRandom() {
        return distanciaRandom;
    }

    public void setDistanciaRandom(int distanciaRandom) {
        this.distanciaRandom = distanciaRandom;
    }

    public String getColor() {
        return color;
    }

    public boolean isGanador() {
        return ganador;
    }

    @Override
    public void run() {

        while (distanciaRandom <= meta) {
            synchronized (finalizar) {
                if (ganador){
                    System.out.println("gano otro auto");
                    return;
                }

            }
            distanciaRandom = distanciaRandom + (int) (Math.random() * (10 - 1)) + 1;
            System.out.println("el auto " + this.color + " va en el km " + distanciaRandom);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            /*String animacion = "";
            for (int i = 0; i <= meta; i++) {
                if (i == distanciaRandom) {
                    animacion = animacion + this.color;

                } else {
                    animacion = animacion + "-";
                }                                                  con dibujos
            }
            try {
                System.out.print("\r" + animacion);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }*/

        }





    }
}
