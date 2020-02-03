package br.com.jessica.exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            //e.printStackTrace(); // mostra o que acarretou a exceção
        }
        System.out.println("End of program");

        sc.close();
    }
}
