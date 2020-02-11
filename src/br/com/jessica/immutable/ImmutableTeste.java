package br.com.jessica.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ImmutableTeste {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ImmutableClass immut = new ImmutableClass(10,"Anna",
                                                sdf.parse("16/12/1991 08:30:00"));

        System.out.println(immut.getAtributoImutavel1());
        System.out.println(immut.getAtributoImutavel2());
        System.out.println(immut.getAtributoMutavel1());

        ImmutableClass immut2 = immut;

        System.out.println(immut2);
        System.out.println(immut);

        System.out.println("---------------------------------------------");

        immut = new ImmutableClass(11,"Manuela",
                                    sdf.parse("16/12/1992 08:30:00"));

        System.out.println(immut);
        System.out.println(immut2);
    }
}
