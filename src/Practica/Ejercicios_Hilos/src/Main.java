public class Main {
    public static void main(String[] args) {
                    /*TODO: contador*/
          //definir una clase contador con un metodo incrementara que modifica un
          // valor utilizando 2 hilos, realizar ejecuiones de ese metodo
        //actualiaar el metodo para que no haya inconsitencias
        Contador contador = new Contador();


        Thread miHilo1 = new Thread(()-> {
            for (int i = 0; i < 1000 ;i++){
                contador.incrementar_noSincronizado();
            }
        });

        Thread miHilo2 = new Thread(()-> {
            for (int i = 0; i < 1000 ;i++){
                contador.incrementar_noSincronizado();
            }
        });

        miHilo1.start();
        miHilo2.start();


        try {

            miHilo1.join();
            miHilo2.join();

            System.out.println(contador.getvalor());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}