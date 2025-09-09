public class Main {
    public static void main(String[] args) {
        //ej 4 productor - consumidor

        Buffer buffer = new Buffer();

        Runnable producir = ()-> {
            try {
                for (int i = 1; i <= 5; i++){
                    buffer.producir(i);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable consumir = ()-> {
            try {
                for (int i = 1; i <= 5; i++){
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
}catch (InterruptedException e) {
    e.printStackTrace();
}








    }





}