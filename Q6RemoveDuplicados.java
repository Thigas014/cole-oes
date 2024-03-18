import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q6RemoveDuplicados {

    public static <T> List<T> RemoveDuplicada(List<T> ListaDuplicada) {
        Set<T> conjunto = new HashSet<>();
        List<T> ListaUnica = new ArrayList<>();

        for (T elemento : ListaDuplicada) {
            if (conjunto.add(elemento)) {
                ListaUnica.add(elemento);
            }
        }

        return ListaUnica;
    }

    public static void main(String[] args) {
        List<Integer> ListaDuplicada = new ArrayList<>();
        ListaDuplicada.add(1);
        ListaDuplicada.add(2);
        ListaDuplicada.add(3);
        ListaDuplicada.add(2);
        ListaDuplicada.add(4);
        ListaDuplicada.add(3);

        System.out.println("Lista original: " + ListaDuplicada);

        List<Integer> ListaUnica = RemoveDuplicada(ListaDuplicada);

        System.out.println("Lista sem duplicatas: " + ListaUnica);
    }

}
