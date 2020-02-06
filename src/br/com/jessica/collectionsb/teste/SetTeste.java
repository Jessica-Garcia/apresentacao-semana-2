package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("12345", "Notebook", 3000.0, 10);
        Produto produto2 = new Produto("32165", "Picanha", 50.0, 10);
        Produto produto3 = new Produto("89101", "Teclado", 100.0, 0);
        Produto produto4 = new Produto("10111", "Celular", 2000.0, 0);

        Set<Produto> produtoSet = new HashSet<>(); // sem ordem
        //Set<Produto> produtoSet = new LinkedHashSet<>();//ordem de inserçao
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);

        for(Produto p : produtoSet){
            System.out.println(p);
        }
    }
}
