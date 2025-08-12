import java.util.Random;
import java.util.function.ToDoubleBiFunction;

public class Main {
    static  int buscarSecuencial (int [] array , int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }

        }


     return -1;//si no entro nunca al if no encontro el numero buscado y retorna -1
    }
    static int buscarBinario (int [] array, int num) {
        int aux = -1;
        int izquierda = 0;
        int derecha = array.length -1;

        while (izquierda <= derecha) {

            int indiceMedio = izquierda + (derecha - izquierda) / 2;

            int valorMedio = array[indiceMedio];

            if (valorMedio == num) {
                return indiceMedio;
            }
            else if (num > valorMedio) {

                derecha = indiceMedio -1;

            }
            else {
                izquierda = indiceMedio +1;

            }

        }





        return aux;
    }



    static int [] ordenarArray (int [] array) {

        int aux;

        for (int a = 0; (a < array.length); a ++) {
            for (int b = 0 ; (b < array.length) ; b ++) {
                if (array[a] > array[b]) {
                    aux = array[b];
                    array[b] = array[a];
                    array[a] = aux;

                }

            }



        }
        return array;
    }


    static int [] generarValorAleatorio(int tamaño, int minimo, int maximo)  {
        Random random = new Random();
        int [] array = new int[tamaño];

        for (int i = 0; i < tamaño; i ++) {
            //genera un numero aleatorio entre maximo y minimo
            array[i] = random.nextInt(maximo - minimo + 1) + minimo;

        }
        return array;
    }

    public static void main(String[] args) {


        //TODO definir 2 arrays de numeros random, 1 hay que ordenarla y hacerle una busqueda binaria y la otra una busqueda secuencial sin ordenar

        int[] array1 = generarValorAleatorio(100,0,50);
        int[] array2 = generarValorAleatorio(100,0,50);
        array1 = ordenarArray(array1);
        int valor1 = 25;
        int valor2 = 40;
        int indiceBuscado = buscarBinario(array1,valor1);
        int indiceBuscado2 = buscarSecuencial(array2, valor2);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("- " + array1[i] +"("+ i +")");
        }

        System.out.println("\nel indice del valor: " + valor1 + "="+ indiceBuscado);

        for (int i = 0; i < array2.length; i++) {
            System.out.print("- " + array2[i] +"("+ i +")");
        }

        System.out.println("\nel indice del valor: " + valor2 + "="+ indiceBuscado2);



    }
}