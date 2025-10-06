public class Contador {
    private int valor = 0;

    public int getvalor(){
    return valor;}

    public synchronized void incrementar  (){
        valor++;
    }

    public void incrementar_noSincronizado () {
        valor++;
    }




}
