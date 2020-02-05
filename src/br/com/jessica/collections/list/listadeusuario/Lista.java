package br.com.jessica.collections.list.listadeusuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        // para acessar pelo índice:
        System.out.println(lista.get(3));

        // para remover pelo índice, retorna o objeto excluído
        System.out.println("Removido " + lista.remove(1));

        //removendo pelo objeto, retorna true ou false
        System.out.println(lista.remove(new Usuario("Manu")));

        //verificar se o elemento está contido, retorna true ou false
        System.out.println("contém? " + lista.contains(new Usuario("Lia")));

        for(Usuario u : lista){
            System.out.println(u);
        }
    }
}
