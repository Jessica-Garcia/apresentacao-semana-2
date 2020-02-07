package br.com.jessica.mutable.teste;

import br.com.jessica.collectionsb.classes.Produto;

public class MutableTeste {
    public static void main(String[] args) {
        Produto p1, p2;

        p1 = new Produto("12345", "Notebook", 2000.0);

        // apontam para o mesmo objeto, possuem mesmo endereço de memória
        p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("-----------------------------------------");

        // mudando os valores do objeto dentro do mesmo endereço, sem instanciar novo objeto
        p1.setNome("Celular");
        p1.setId("000000");
        p1.setPreco(1500.0);

        // como apontam para o mesmo endereço, e não foi criado novo objeto os valores mudarão para as duas variáveis
        System.out.println(p1);
        System.out.println(p2);

    }
}
