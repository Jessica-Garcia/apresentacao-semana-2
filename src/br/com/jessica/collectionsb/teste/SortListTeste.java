package br.com.jessica.collectionsb.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTeste {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Anna");
        nomes.add("Maria");
        nomes.add("Felipe");
        nomes.add("Taís");
        nomes.add("Ricardo");
        nomes.add("Patrícia");
        nomes.add(0, "Bete");

        //para ordenar uma List por ordem alfabética:
        Collections.sort(nomes);

        for(String nome : nomes){
            System.out.println(nome);
        }

        List <Double> numeros = new ArrayList<>();

        numeros.add(8.1);
        numeros.add(4.1);
        numeros.add(3.1);
        numeros.add(2.1);

        Collections.sort(numeros);

        for(Double numero : numeros){
            System.out.println(numero);
        }

    }
}
