
import java.util.*;

public class Main {

    public static List<String> Saludar (List<String> listaInmutable) {
        List<String> copia = new ArrayList<>();

        for (String n : listaInmutable) {
            copia.add("Hola " + n);
        }

        return copia;
    }




    public static List<Integer> sumarValor (List<Integer> listaInmutable,int valor) {
        // Crea una copia vacia
        List<Integer> copia = new ArrayList<>();

        // Recorre la lista inmutable y va cargando los valores duplicados a la copia
        for (int n : listaInmutable)
            copia.add(n + valor);

        // Retorna la copia
        return copia;
    }



//todo repetir las funciones pero en lamda
    public static void main(String[] args) {

        List<Integer> Listainmutable = List.of(4,5,6,8,9);

        System.out.println("Lista original " + Listainmutable);
        System.out.println("Lista copia " + sumarValor(Listainmutable,4));


        List<String> listaDeNombres = List.of("homero","elena","agustin");
        System.out.println("Lista original " + listaDeNombres);
        System.out.println("Lista copia " + Saludar(listaDeNombres));
    }











}