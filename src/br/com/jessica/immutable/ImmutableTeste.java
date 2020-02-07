package br.com.jessica.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ImmutableTeste {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ImmutableClass immut = new ImmutableClass(10,"Anna", sdf.parse("16/12/1991 08:30:00"));

        System.out.println(immut.getAtributoImutavel1());
        System.out.println(immut.getAtributoImutavel2());
        System.out.println(immut.getAtributoMutavel1());

        //pode-se fazer cópia apenas da referência do objeto imutável
        String string1 = "abcd";
        String string2 = string1;

        System.out.println(string1);
        System.out.println(string2);
        System.out.println("--------------------------------------------");
        //só muda se criar um novo objeto
        string1 = "1234";
       // string2 = string1;


        System.out.println(string1);
        System.out.println(string2);
        System.out.println("--------------------------------------------");

        ImmutableClass immut2 = immut;

        System.out.println(immut2.getAtributoImutavel2());
        System.out.println(immut.getAtributoImutavel2());

    }
}
