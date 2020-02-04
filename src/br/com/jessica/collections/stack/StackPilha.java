package br.com.jessica.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno príncepe");
        livros.push(""); // pode gerar exceção para pilhas com restrição de tamanho
    }
}
