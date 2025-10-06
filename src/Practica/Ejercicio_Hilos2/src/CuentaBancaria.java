public class CuentaBancaria {
public int saldo = 0;
byte primera_ejecucion = 0;


public void despositar (int monto){
    saldo = saldo + monto;



}

public synchronized void retirar (int monto){
    if (saldo - monto >= 0) {
        saldo = saldo - monto;
    }else {
        System.out.println("saldo insuficiente");

    }


}

}
