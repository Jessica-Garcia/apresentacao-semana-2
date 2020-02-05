package br.com.jessica.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        // adiciona caso nao exista e substitui caso já exista:

        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");

        System.out.println("Número de usuários: " + usuarios.size());

        usuarios.put(2, "Rafaela");
        usuarios.put(20, "Ricardo");
        usuarios.put(4, "Rebeca");

        System.out.println("Número de usuários: " + usuarios.size());
        System.out.println("Está vazio? " + usuarios.isEmpty());


        //para retornar somente as chaves (Não ordena naturalmente as chaves):

        System.out.println("ID dos usuários: " + usuarios.keySet());


        // para retornar somente so valores

        System.out.println("Nomes do usuários: " + usuarios.values());


        // para retornar chave e valor:

        System.out.println("ID e Nomes: " + usuarios.entrySet());


        // para saber se contém a chave:

        System.out.println("Contém chave? " + usuarios.containsKey(20));


        // para saber se contém valor:

        System.out.println("Contém Valor? " + usuarios.containsValue("Rebeca"));


        // para obter valor através da chave:

        System.out.println("Nome pelo ID: " + usuarios.get(20));


        //removendo pela chave

        System.out.println("Usuário removido: " + usuarios.remove(1));


        //removendo pela chave e valor (retorna true ou false)

        System.out.println("Usuário removido: " + usuarios.remove(4, "Rebeca"));


        System.out.println("Percorrendo pela chave:");

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        System.out.println("Percorrendo pelo valor:");

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        System.out.println("Percorrendo por chave e valor");

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
    }
}
