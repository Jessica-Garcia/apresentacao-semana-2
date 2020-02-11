package br.com.jessica.mutable.teste;

public class MutableAndImmutableTeste {
    public static void main(String[] args) {

        System.out.println("Imutáveis:");

        // para alterar tem que criar novo objeto, cria outro endereço de memória

        String s = "a";
        s = s.concat("b");

        System.out.println("Valor de s: " + s);

        String t = s;

        System.out.println("Valor de t: " + t);
        System.out.println("t é igual a s? " + t.equals(s));
        System.out.println("---------------------------------");

        s = t.concat("c");

        System.out.println("Novo valor de s: " + s);
        System.out.println("Novo valor de t: " + t);
        System.out.println("t ainda é igual a s? " + t.equals(s));

        System.out.println("-----------------------------------------------------");

        System.out.println("Mutáveis:");

        // não precisa criar outro objeto para alterar, altera o objeto e não o endereço

        StringBuilder s2 = new StringBuilder("a");
        s2.append("b");

        System.out.println("Valor de s2: " + s2);

        StringBuilder t2 = s2;

        System.out.println("Valor de t2: " + t2);

        System.out.println("t2 é igual a s2? " + t2.equals(s2));
        System.out.println("------------------------------------");

        s2.append("c");

        System.out.println("Novo valor de s2: " + s2);
        System.out.println("Novo valor de t2: " + t2);

        System.out.println("t2 ainda é igual a s2? " + t2.equals(s2));


    }
}
