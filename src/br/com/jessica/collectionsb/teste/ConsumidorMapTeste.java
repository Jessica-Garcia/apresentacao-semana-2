package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Consumidor;
import br.com.jessica.collectionsb.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Anna", "123456");
        Consumidor consumidor2 = new Consumidor("Maria", "348952");
        Produto produto1 = new Produto("12345", "Notebook", 3000.0);
        Produto produto2 = new Produto("32165", "Picanha", 50.0);
        Produto produto3 = new Produto("89101", "Teclado", 100.0);
        Produto produto4 = new Produto("10111", "Celular", 2000.0);

        //Associar um consumidor a uma lista de produtos
        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtoscon1 = new ArrayList<>();
        produtoscon1.add(produto1);
        produtoscon1.add(produto2);

        List<Produto> produtoscon2 = new ArrayList<>();
        produtoscon2.add(produto3);
        produtoscon2.add(produto4);

        map.put(consumidor1, produtoscon1);
        map.put(consumidor2, produtoscon2);

        for(Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            //como value é uma list, precisa outro laço para imprimir
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }
    }
}
