package br.com.jessica.exceptions.trycatch;

import java.util.Scanner;

public class ThrowsTeste {
    public static void main(String[] args) {
        System.out.println("Entre com um número decimal:");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        }
        catch (Exception e) {
            System.out.println("Entrada inválida");
            //e.printStackTrace();
        }
    }
    public static double leNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}
