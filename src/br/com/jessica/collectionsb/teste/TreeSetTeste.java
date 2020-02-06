package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("12345", "Notebook", 3000.0, 10);
        Produto produto2 = new Produto("32165", "Picanha", 50.0, 10);
        Produto produto3 = new Produto("89101", "Teclado", 100.0, 0);
        Produto produto4 = new Produto("10111", "Celular", 2000.0, 0);
        Produto produto5 = new Produto("12134", "Geladeira", 2000.0, 0);

        NavigableSet<Produto> produtos = new TreeSet<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

//        for(Produto produto : produtos){
//            System.out.println(produto);
//        }

        //para imprimir o conjunto em ordem Inversa:
        for(Produto produto : produtos.descendingSet()){
            System.out.println(produto);
        }

        System.out.println("Tamanho" + produtos.size());

        // retornar o primeiro objeto removendo ele do conjunto:
        System.out.println("Removendo " + produtos.pollFirst());

        System.out.println("Tamanho" + produtos.size());

        // retornar o último objeto removendo ele do conjunto:
        System.out.println("Removendo " + produtos.pollLast());
    }
}
