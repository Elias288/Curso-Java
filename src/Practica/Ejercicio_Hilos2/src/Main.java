public class Main {
    public static void main(String[] args) {
      //ej 1 de sincroniacion de hilos
        //caja de ahorro

    CuentaBancaria micuenta = new CuentaBancaria();

    Runnable retirar = () -> {
        for (int i = 0; i < 3; i++)
            micuenta.retirar(5);

    }  ;


    Runnable depositar = () -> {
        for (int i = 0 ; i < 3 ;i++)
            micuenta.despositar(4);
    };

    Thread empleado = new Thread(retirar);
    Thread jefe = new Thread(depositar);

    empleado.start();
    jefe.start();

        try {
            empleado.join();
            jefe.join();
            System.out.println(micuenta.saldo);
            Thread.sleep(3000);
            micuenta.despositar(200);
            System.out.println(micuenta.saldo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
}