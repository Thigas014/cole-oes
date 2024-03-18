
import java.util.ArrayList;

public class Q3Pilha<L> {
    private ArrayList<L> elementos;

    // pilha ultimo a entrar é o primeiro a sair
    public Q3Pilha() {
        this.elementos = new ArrayList<>();
    }

    public void push(L elemento) { // adiciona no topo da pilha
        elementos.add(elemento);
    }

    public L pop() { // remove e retorna o elemento do topo da pilha
        // pode ter uma exceção da pilha vazia
        return elementos.remove(elementos.size() - 1);
    }

    public L peek() { // retorna o TOPO sem remover
        // pode ter uma exceção da pilha vazia
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() { // true se tiver vazia ou false n vazia
        return elementos.isEmpty();
    }

    public int size() { // tamanho
        return elementos.size();
    }


public static void main(String[] args) {
    // Criando uma pilha com valores pré-definidos
    Q3Pilha<Integer> pilha = new Q3Pilha<>();
    pilha.push(10);
    pilha.push(20);
    pilha.push(30);

    // Desempilhando e exibindo os elementos da pilha
    System.out.println("Elementos na pilha:");
    System.out.println(pilha.pop());
    System.out.println(pilha.isEmpty());
    System.out.println(pilha.peek());
    System.out.println(pilha.pop());
    System.out.println(pilha.pop());
    System.out.println(pilha.isEmpty());
}
}