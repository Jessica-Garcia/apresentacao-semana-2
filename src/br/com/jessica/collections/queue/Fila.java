package br.com.jessica.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // adicionando elementos com add
        fila.add("Anna"); // pode gerar exceção para filas com restrição cheias

        // adicionando elementos com offer( geralmente para filas com restrição, retorna true ou false)
        fila.offer("Bia");

        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //para obter o próximo elemento da fila sem remover o elemento, (mostra sempre o mesmo elemento)

        System.out.println(fila.peek()); // peek retorna null se a fila estiver vazia
        System.out.println(fila.peek());

        System.out.println(fila.element()); // element pode gerar exceção NoSuchElementException para fila vazia
        System.out.println(fila.element());


        //retonar o próximo elemento da fila já removendo ele da fila(mostra os próximos elementos)

        System.out.println(fila.poll()); //retorna false para lista vazia

        System.out.println(fila.remove()); // lança uma exceção NoSuchElementException para fila vazia

        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // tamanho da fila
        System.out.println(fila.size());

        // fila.clear(); apaga os elementos da fila
        // fila.isEmpty(); para saber se a fila está ou não vazia;
        // fila.contains(); para saber se um objeto está ou não contido na fila
    }
}
