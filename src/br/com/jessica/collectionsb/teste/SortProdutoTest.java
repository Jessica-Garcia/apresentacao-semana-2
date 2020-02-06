package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Produto;
import br.com.jessica.collectionsb.classes.ProdutoNomeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("12345", "Notebook", 3000.0);
        Produto produto2 = new Produto("32165", "Picanha", 50.0);
        Produto produto3 = new Produto("89101", "Teclado", 100.0);
        Produto produto4 = new Produto("10111", "Celular", 2000.0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        //Collections.sort(produtos);// para ordenar pelo compareTo

        // ordena pelo comparator
        Collections.sort(produtos, new ProdutoNomeComparator());

        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
