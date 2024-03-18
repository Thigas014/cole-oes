import java.util.*;

public class Q4NumerosUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números inteiros separados por espaço:");
        String input = scanner.nextLine();
        
        String[] numlista = input.split(" ");
        
        // LinkedHashSet mantem a ordem de entrada e remove as duplicaç~oes
        Set<Integer> numerosUnicos = new LinkedHashSet<>();
        for (String num : numlista) {
            numerosUnicos.add(Integer.parseInt(num));
        }
        
        
        System.out.println("Números sem duplicações:");
        for (Integer num : numerosUnicos) {
            System.out.print(num + " ");
        }
    }
}
