package br.com.jessica.collectionsb.teste;

import br.com.jessica.collectionsb.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "1234567");
        Celular celular2 = new Celular("Iphone 6S", "1234568");
        Celular celular3 = new Celular("Sony Xperia", "1234569");

        List<Celular> celulares = new ArrayList<>();

        celulares.add(celular1);
        celulares.add(celular2);
        celulares.add(celular3);

        //aceita objetos com valores repetidos
        Celular celular4 = new Celular("Galaxy S7", "1234567");
        celulares.add(celular4);

        for(Celular celular : celulares){
            System.out.println(celular);
        }


        // comparando objetos
        System.out.println("São iguais? " + celular1.equals(celular4));

        // verificar se existe na lista
        System.out.println("Existe? " + celulares.contains(celular4));
    }
}
