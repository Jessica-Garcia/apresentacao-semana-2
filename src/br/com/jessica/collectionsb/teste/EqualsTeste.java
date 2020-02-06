package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Celular;

public class EqualsTeste {
    public static void main(String[] args) {
        Celular c1 = new Celular("Iphone", "78945");
        Celular c2 = new Celular("Iphone", "78945");
        System.out.println(c1.equals(c2));
    }
}
