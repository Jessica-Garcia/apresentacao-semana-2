package br.com.jessica.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        //para deixar os elementos ordenado por ordem de inserção instanciar com:
        //SortedSet<String> lista = new TreeSet<>();
        //TreeSet<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        System.out.println(lista);

        for(String nome : lista){
            System.out.println(nome);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);

        for(Integer n : nums){
            System.out.println(n);
        }
    }
}
