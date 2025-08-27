import java.util.*;

public class Main {







    public static void main(String[] args) {
        //utilizando una expresion lambda filtrar un lista de nombres los nombres que empiezen por una letra especifica
        //string.startwith("m")
        //.stream()    .filter()

        List<String> nombres = Arrays.asList("Ana", "Luis", "Marta", "Pedro","homero","micael","juan","daniel","sebastian","santiago","valentin","camilo","allan","lucas");
        nombres.stream()
                .filter(nombre -> nombre.startsWith("s"))
                .forEach(nombre -> System.out.println("nombre que empieza por s " + nombre));





    }
}