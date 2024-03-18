import java.util.HashMap;
import java.util.Map;

public class Q8FrequenciaCaracteres {
    public static void main(String[] args) {
        String texto = "Olá, mundo!";
        Map<Character, Integer> frequencia = new HashMap<>();

        // Percorre cada caractere na string e conta sua frequência
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) { // Verifica se o caractere é uma letra
                c = Character.toLowerCase(c); // Converte para minúscula
                if (frequencia.containsKey(c)) {
                    frequencia.put(c, frequencia.get(c) + 1); // Incrementa a contagem
                } else {
                    frequencia.put(c, 1); // Adiciona o caractere ao mapa
                }
            }
        }

        // Exibe a frequência de cada caractere
        for (Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            System.out.println("Caractere '" + entry.getKey() + "' ocorre " + entry.getValue() + " vezes.");
        }
    }
}
