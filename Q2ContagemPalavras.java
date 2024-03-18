import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2ContagemPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = scanner.nextLine();
        texto = texto.toLowerCase();

        String[] palavras = texto.split("\\s+");

        // Criando um HashMap para armazenar as palavras e suas contagens
        Map<String, Integer> contadorPalavras = new HashMap<>();

        // Contando o número de ocorrências de cada palavra
        for (String palavra : palavras) {
            if (contadorPalavras.containsKey(palavra)) {
                contadorPalavras.put(palavra, contadorPalavras.get(palavra) + 1);
            } else {
                contadorPalavras.put(palavra, 1);
            }
        }

        System.out.println("Contagem de ocorrências de cada palavra:");
        for (Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
