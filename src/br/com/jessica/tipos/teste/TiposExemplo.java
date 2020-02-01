package br.com.jessica.tipos.teste;


import java.util.ArrayList;
import java.util.List;

public class TiposExemplo {
    public static void main(String[] args) {
        // Tipos primitivos
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;

        float num5 = 3.5f;
        double num6 = 3.5555;

        boolean flag = true;
        char a = 'a';

        //Wrapper Classes que representam tipos primitivos
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100; //  Integer num9 = new Integer(100);
        Long num10 = 10000l;

        Float num11 = 3.5f;
        Double num12 = 3.5555;

        Boolean flag2 = true;
        Character b = 'b';

        // tranformação do tipo primitivo para tipo wrapper class é natural(autoboxing)

        int pri = 200;
        Integer wra = pri;
        System.out.println("primitivo para wrapper: " + wra);

        // tranformação do tipo classe em tipo primitivo é natural (auto-unboxing)

        Integer wrapper = 300; // mas não pode ser null
        int primitivo = wrapper; // int primitivo = wrapper.intValue();
        System.out.println("wrapper para primitivo: " + primitivo);

        // comparações com "==" em wrappers podem dar problema:

        Integer x = 500;
        Integer y = 500;

        System.out.println("Comparação wrappers com ==");

        if (x == y){
            System.out.println("x = y: " + true);
        }
        else{
            System.out.println("x = y: " + false);
        }

        // melhor comparar wrappers com métodos, como .equals, por exemplo

        System.out.println("Comparação wrappers com .equals");

        if (x.equals(y)){
            System.out.println("x = y: " + true);
        }
        else{
            System.out.println("x = y: " + false);
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(x);
        numeros.add(num9);
        numeros.add(pri);
        numeros.add(primitivo);
        numeros.add(wrapper);
        numeros.add(num3);
        numeros.add(y);
        System.out.println("Lista de Integers:");
        for (Integer numero : numeros){
            System.out.print(numero + ", ");
        }
    }

}
