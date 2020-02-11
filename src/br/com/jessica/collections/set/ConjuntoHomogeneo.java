package br.com.jessica.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        //para deixar os elementos ordenado por ordem alfabética:
        //Set<String> lista = new TreeSet<>();
        //TreeSet<String> lista = new TreeSet<>();
        //para deixar os elementos ordenado por ordem de inserção:
        //Set<String> lista = new LinkedHashSet<>();
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luca");

        System.out.println(lista);
        System.out.println("--------------------------------");

        for(String nome : lista){
            System.out.println(nome);
        }

        System.out.println("--------------------------------");
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
        System.out.println("--------------------------------");

        for(Integer n : nums){
            System.out.println(n);
        }
    }
}
