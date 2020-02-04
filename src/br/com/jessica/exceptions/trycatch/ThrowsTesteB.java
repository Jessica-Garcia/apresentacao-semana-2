package br.com.jessica.exceptions.trycatch;

import java.util.Scanner;

public class ThrowsTesteB {
    public static void main(String[] args) throws Exception{
        System.out.println("Entre com um número decimal:");

        double num = leNumero();
        System.out.println("Você digitou: " + num);

        System.out.println("Entrada inválida");
        //e.printStackTrace();
    }

    public static double leNumero() throws Exception {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}
