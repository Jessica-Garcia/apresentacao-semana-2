package br.com.jessica.collections.list.listateste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Anna");
        nomes.add("Maria");
        nomes.add("Carina");
        nomes.add("Maria");
        nomes2.add("Marta");
        nomes2.add("Carla");
        nomes2.add("Maria");
        nomes2.add("Meg");

        // eliminar todos os elementos da lista, sem eliminar o objeto;

        nomes.clear();

        // para unir duas coleções

        nomes.addAll(nomes2);


        for(String n : nomes){
            System.out.println(n);
        }


    }
}
