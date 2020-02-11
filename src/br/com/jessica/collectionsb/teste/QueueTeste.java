package br.com.jessica.collectionsb.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");

        System.out.println(queue);

        // mostra mas não remove
        //System.out.println(queue.peek());

        //mostra e remove de acordo com a ordem
        //System.out.println(queue.poll());

        //mostra e remove de acordo com a ordem
        //System.out.println(queue.remove());

        // remove objeto específico retorna true ou false
       //System.out.println(queue.remove("B"));

        System.out.println(queue.size());

        // depois de remover não respeitou mais a ordem...????
        System.out.println(queue);
    }
}
