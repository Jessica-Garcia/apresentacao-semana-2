package br.com.jessica.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        //para deixar os elementos ordenado por ordem alfabética:
        //Set<String> conjunto = new TreeSet<>();
        //TreeSet<String> conjunto = new TreeSet<>();
        //para deixar os elementos ordenado por ordem de inserção:
        //Set<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Carlos");
        conjunto.add("Ana");
        conjunto.add("Pedro");
        conjunto.add("Luca");

        System.out.println(conjunto);
        System.out.println("--------------------------------");

        for(String nome : conjunto){
            System.out.println(nome);
        }

        System.out.println("--------------------------------");
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(4);

        System.out.println(nums);
        System.out.println("--------------------------------");

        for(Integer n : nums){
            System.out.println(n);
        }
    }
}
