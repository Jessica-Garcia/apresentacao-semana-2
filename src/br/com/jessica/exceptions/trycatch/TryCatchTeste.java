package br.com.jessica.exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite os nomes separados por espaço:");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Digite o número da posição do array:");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            //e.printStackTrace(); // mostra o que acarretou a exceção
            //System.out.println(e.getMessage());
        }
        System.out.println("End of program");

        sc.close();
    }
}
