package br.com.jessica.collections.stack;

import java.util.Stack;

public class StackPilha {
    public static void main(String[] args) {
        Stack<String> livros = new Stack<>();

        livros.add("O pequeno príncepe"); // retorna true or false para pilhas com restrição de tamanho
        livros.push("Dom Casmurro"); // pode gerar exceção para pilhas com restrição de tamanho
        livros.push("Memórias póstumas de Brás Cubas");


        for(String livro : livros){
            System.out.println(livro);
        }

        System.out.println("--------------------------------------");

        // retorna o último elemento que entrou na pilha

        System.out.println("Último elemento adicionado: " + livros.peek()); // gera exceção EmptyStackException para pilha vazia


        // remove elementos da pilha começando pelo último que entrou:


        System.out.println("Removendo: " + livros.pop()); // gera exceção EmptyStackException para pilha vazia
        System.out.println("Removendo: " + livros.pop());
        System.out.println("Removendo: " + livros.pop());

        //System.out.println("Último elemento: " + livros.peek());
        //System.out.println("Removendo: " + livros.pop());

        System.out.println(livros.isEmpty());

    }
}
