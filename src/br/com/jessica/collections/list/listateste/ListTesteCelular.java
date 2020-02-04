package br.com.jessica.collections.list.listateste;

import br.com.jessica.equalshashcode.equals.celular.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListTesteCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "1234567");
        Celular celular2 = new Celular("Iphone 6S", "1234568");
        Celular celular3 = new Celular("Sony Xperia", "1234569");

        List<Celular> celulares = new ArrayList<>();

        celulares.add(celular1);
        celulares.add(celular2);
        celulares.add(celular3);

        for(Celular celular : celulares){
            System.out.println(celular);
        }

        Celular celular4 = new Celular("Galaxy S7", "1234567");
        System.out.println(celular1.equals(celular4));

        // verificar se existe na lista
        System.out.println(celulares.contains(celular4));
    }
}
