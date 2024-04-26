import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List<String> lista = List.of("perro","gato","conejo");
        System.out.println(lista);
        // 1 forma de hacerlo
        List<String> listaNueva = new ArrayList<>(lista);
        listaNueva.add("pato");
        System.out.println(listaNueva);
        // 2da. forma
        List<String> lista2Nueva = new ArrayList<>();
        //lista2Nueva.addAll(lista); // 1 opcion
        for (String s : listaNueva) { //2 opciongit 
            lista2Nueva.add(s);
        }

    }
}
