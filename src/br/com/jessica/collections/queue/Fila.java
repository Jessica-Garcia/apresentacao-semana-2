package br.com.jessica.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
       // Queue<String> fila = new PriorityQueue<>(); // ordena a queue por algum critério definido por comparable ou comparator

        // adicionando elementos com add
        fila.add("Anna"); // pode gerar exceção IllegalStateException para filas com restrição cheias

        // adicionando elementos com offer( geralmente para filas com restrição, retorna true ou false)
        fila.offer("Bia");

        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //para obter o primeiro elemento da fila sem remover o elemento, (mostra sempre o mesmo elemento)

        System.out.println("Mostrando elemento sem remover");
        System.out.println(fila.peek()); // peek retorna null se a fila estiver vazia
        System.out.println(fila.peek());

        System.out.println(fila.element()); // element pode gerar exceção NoSuchElementException para fila vazia
        System.out.println(fila.element());

        // tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());

        //retonar o próximo elemento da fila já removendo ele da fila(mostra os próximos elementos)

        System.out.println("Mostrando elemento e removendo:");

        System.out.println(fila.poll()); //retorna false para fila vazia

        System.out.println(fila.remove()); // lança uma exceção NoSuchElementException para fila vazia

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());

        // fila.clear(); apaga os elementos da fila
        // fila.isEmpty(); para saber se a fila está ou não vazia;
        // fila.contains(); para saber se um objeto está ou não contido na fila

        // para restringir tamanho da fila:
        Queue<Integer> q = new ArrayBlockingQueue<>(4);
        q.offer(7);

        q.add(8);
        q.offer(9);
        q.add(9);
        q.offer(10);
       // q.add(12); gera exceção para fila cheia

        System.out.println("Fila com restrição:");
        System.out.println(q);

    }
}
