
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Q1Palindromo {
    public static boolean isPalindromo(String str) {
        
        str = str.replace("\s+", "").toLowerCase();
        
        Deque<Character> deque = new LinkedList<>();
        
        // Adicionar os caracteres da string à deque
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        
        // Verificar se a string é um palíndromo
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (isPalindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }
}

