package br.com.jessica.tipos.teste;



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
        // boxing (tranformação do tipo primitivo para tipo classe wrapper) é natural
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100; // = Integer num9 = new Integer(100);
        Long num10 = 10000l;

        Float num11 = 3.5f;
        Double num12 = 3.5555;

        Boolean flag2 = true;
        Character b = 'b';

        // unboxing natural (tranforma tipo classe em tipo primitivo)

        Integer wrapper = 100;
        int primitivo = wrapper; // int primitivo = wrapper.intValue();
        System.out.println(primitivo);


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

        // melhor comparar wrappers com método .equals

        System.out.println("Comparação wrappers com .equals");

        if (x.equals(y)){
            System.out.println("x é igual a y: " + true);
        }
        else{
            System.out.println("x é igual a y: " + false);
        }

    }

}
