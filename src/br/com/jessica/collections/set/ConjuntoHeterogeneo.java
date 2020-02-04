package br.com.jessica.collections.set;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoHeterogeneo {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        //adicinando elementos:
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        //printando tamanho
        System.out.println("O tamanho é: " + conjunto.size());

        // não aceita elementos repetidos:
        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("O tamanho é: " + conjunto.size());

        //remover retorna true ou false
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("O tamanho é: " + conjunto.size());

        //contains para saber se tem algum elemento no conjunto, retorna true ou false
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // mostrando os valores:
        System.out.println(nums);
        System.out.println(conjunto);

        //para fazer a união entre os conjuntos, (não mantém uma ordem)
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // para fazer a intersecção entre os conjuntos, deixa apenas o valor em comum
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        // para limpar o conjunto
        conjunto.clear();
        System.out.println(conjunto);
    }
}
